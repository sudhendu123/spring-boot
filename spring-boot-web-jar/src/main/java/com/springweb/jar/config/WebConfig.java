package com.springweb.jar.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.apache.catalina.Context;
import org.apache.catalina.connector.Connector;
import org.apache.tomcat.util.descriptor.web.SecurityCollection;
import org.apache.tomcat.util.descriptor.web.SecurityConstraint;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addResourceHandlers(final ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/*.js/**").addResourceLocations("/js/");
        registry.addResourceHandler("/*.css/**").addResourceLocations("/css/");
    }

    @Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("welcome.html");
		registry.addViewController("/dash").setViewName("welcome.html");
	}

    /*@Bean
    public InternalResourceViewResolver setupViewResolver()  {
        InternalResourceViewResolver resolver =  new InternalResourceViewResolver();
        resolver.setPrefix ("/view/");
        resolver.setSuffix ("");
        //resolver.setViewClass (JstlView.class);
        return resolver;
    }*/
    
    @Bean
	public ServletContextInitializer initializer(){
		return new ServletContextInitializer() {
			
			@Override
			public void onStartup(ServletContext servletContext) throws ServletException {
				servletContext.setInitParameter("paramName", "ParamValue");
				servletContext.getSessionCookieConfig().setName("TestApp");
				servletContext.getSessionCookieConfig().setSecure(true);
				servletContext.getSessionCookieConfig().setHttpOnly(true);
			}
		};
	}
    
    @Bean
    public EmbeddedServletContainerFactory servletContainer() {
    TomcatEmbeddedServletContainerFactory tomcat = new TomcatEmbeddedServletContainerFactory() {
    @Override
    protected void postProcessContext(Context context) {
    SecurityConstraint securityConstraint = new SecurityConstraint();
    securityConstraint.setUserConstraint("CONFIDENTIAL");
    SecurityCollection collection = new SecurityCollection();
    collection.addPattern("/*");
    securityConstraint.addCollection(collection);
    context.addConstraint(securityConstraint);
    }
    };
    tomcat.addAdditionalTomcatConnectors(getHttpConnector());
    return tomcat;
    }
    
    private Connector getHttpConnector() {
    Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
    connector.setScheme("http");
    connector.setPort(8080);
    connector.setSecure(false);
    connector.setRedirectPort(8443);
    return connector;
    }
   
}
