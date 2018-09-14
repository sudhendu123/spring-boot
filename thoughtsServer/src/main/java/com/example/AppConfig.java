package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.example.interceptor.LogInterceptor;
import com.example.service.UtilService;
import com.example.service.UtilServiceAnsImpl;
import com.example.service.UtilServiceImpl;

@Configuration
public class AppConfig extends WebMvcConfigurerAdapter {
	
	//Interceptor
	/*@Autowired
	LogInterceptor logInterceptor;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(logInterceptor);
	}*/
	
	@Value("${JavaSys}")
	public String someVal;
	
	
	
	@Bean(name="getUtilServiceImpl")
	@Scope(value="singleton")
	//@ConditionalOnProperty(name = "language.name", havingValue = "french")
	//@ConditionalOnProperty(name = "language.name", havingValue = "english", matchIfMissing = true)
	public UtilService getUtilServiceImpl() {
		UtilServiceImpl utilServiceImpl=new UtilServiceImpl("StringVar",23);
		
		return utilServiceImpl;
	}
	
	@Bean
	@Scope(value="prototype")
	public UtilService getUtilServiceAnsImpl() {
		
		UtilServiceAnsImpl utilServiceAnsImpl=new UtilServiceAnsImpl();
		utilServiceAnsImpl.setIntVar(12);
		utilServiceAnsImpl.setStringVar("StringValue");
		return utilServiceAnsImpl;
	}
}