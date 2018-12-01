package com.example.annotation;

import java.lang.reflect.Method;

public class RootObject {

	/** Method. */
	private final Method method;
	
	/** Arguments of the method. */
	private final Object[] args;
	
	/** Target object. */
	private final Object target;
	
	/** Target class. */
	private final Class<?> targetClass;

	/**
	 * Constructor
	 * 
	 * @param newMethod
	 *            method
	 * @param newArgs
	 *            arguments passed by the method
	 * @param newTarget
	 *            the target object
	 * @param newTargetClass
	 *            the target class
	 */
	public RootObject(Method newMethod, Object[] newArgs, Object newTarget, Class<?> newTargetClass) {
		method = newMethod;
		target = newTarget;
		targetClass = newTargetClass;
		args = newArgs;
	}

	/**
	 * Returns the method.
	 * 
	 * @return method
	 */
	public Method getMethod() {
		return method;
	}

	/**
	 * Returns the method name.
	 * 
	 * @return method name
	 */
	public String getMethodName() {
		return method.getName();
	}

	/**
	 * Returns the arguments passed by the method.
	 * 
	 * @return args
	 */
	public Object[] getArgs() {
		return args;
	}

	/**
	 * Returns the target object.
	 * 
	 * @return target
	 */
	public Object getTarget() {
		return target;
	}

	/**
	 * Returns the target class.
	 * 
	 * @return targetClass
	 */
	public Class<?> getTargetClass() {
		return targetClass;
	}
}
