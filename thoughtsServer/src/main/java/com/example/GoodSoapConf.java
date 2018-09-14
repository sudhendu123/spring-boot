package com.example;

import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import com.example.controller.SoapController;

@Configuration
public class GoodSoapConf {
	
	@Autowired
	Environment env;

	@Autowired
	SoapController goodSoapController;
	
	@Bean
	public ServletRegistrationBean cxfServlet() {
		return new ServletRegistrationBean(new CXFServlet(), "/services/*");
	}

	@Bean(name = Bus.DEFAULT_BUS_ID)
	public SpringBus springBus() {
		return new SpringBus();
	}
	
	@Bean
    public Endpoint goodSoapControllerPoint() {
		//System.getProperty("java.version");
		//env.getProperty("path");
    	EndpointImpl endpoint = new EndpointImpl(springBus(), goodSoapController);
    	endpoint.publish("/GoodSoap");
    	return endpoint;
    }

}
