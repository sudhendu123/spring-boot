package com.example.annotation;

import java.lang.reflect.Method;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.aop.framework.AopProxyUtils;
import org.springframework.context.expression.MethodBasedEvaluationContext;
import org.springframework.core.DefaultParameterNameDiscoverer;
import org.springframework.core.ParameterNameDiscoverer;
import org.springframework.core.annotation.Order;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.stereotype.Component;



@Aspect
@Order(1)
@Component
public class ReqHeaderAnnoAspect {

	private ExpressionParser parser = new SpelExpressionParser();
	private ParameterNameDiscoverer paramNameDiscoverer = new DefaultParameterNameDiscoverer();
	

	@Around("@annotation(com.example.annotation.AuthTokenAnno) && execution(* *(..))")
	public Object authorizeTokenAspect(ProceedingJoinPoint joinPoint) throws Throwable {
		String methodName = "authorizeTokenAspect()";
		Object returnObject = null;

		
			final MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
			final Object target = joinPoint.getTarget();
			final Class<?> targetClass = getTargetClass(target);
			final String targetMethodName = methodSignature.getMethod().getName();
			final Class<?>[] methodArgTypes = methodSignature.getMethod().getParameterTypes();
			final Method method = targetClass.getMethod(targetMethodName, methodArgTypes);
			final ReqHeaderAnno annoValue = method.getAnnotation(ReqHeaderAnno.class);

			String expression = annoValue.value();

			EvaluationContext context = createEvaluationContext(method, joinPoint.getArgs(), target, targetClass);

			String token = parser.parseExpression(expression).getValue(context, String.class);
			System.out.println(token);
			
			returnObject = joinPoint.proceed();
		return returnObject;
	}

	private Class<?> getTargetClass(Object target) {
		Class<?> targetClass = AopProxyUtils.ultimateTargetClass(target);
		if (targetClass == null) {
			targetClass = target.getClass();
		}
		return targetClass;
	}

	private EvaluationContext createEvaluationContext(Method method, Object[] args, Object target,
			Class<?> targetClass) {

		final RootObject rootObject = new RootObject(method, args, target, targetClass);
		return new MethodBasedEvaluationContext(rootObject, method, args, paramNameDiscoverer);
	}
}
