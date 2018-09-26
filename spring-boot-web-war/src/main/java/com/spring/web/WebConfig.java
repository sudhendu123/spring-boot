package com.spring.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@Configuration
@ComponentScan
public class WebConfig extends WebMvcConfigurerAdapter {
	
	
	/*@Bean
	public WebMvcConfigurerAdapter viewControllers(){
		return new WebMvcConfigurerAdapter() {

			@Override
			public void addResourceHandlers(final ResourceHandlerRegistry registry) {
				registry.addResourceHandler("/*.js/**").addResourceLocations("*");
				registry.addResourceHandler("/*.css/**").addResourceLocations("/WEB-INF/css/");
			}

			@Override
			public void addViewControllers(ViewControllerRegistry registry) {
				registry.addViewController("/").setViewName("csrkodiak");
				registry.addViewController("/csrkodiak").setViewName("csrkodiak");
			}
		};
	}*/
	
    @Override
    public void addResourceHandlers(final ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/*.css/**").addResourceLocations("/WEB-INF/css/","/WEB-INF/commoncss/");
        registry.addResourceHandler("/*.js/**").addResourceLocations("/WEB-INF/js/");
    }
    
/*    @Override
	public void addViewControllers(ViewControllerRegistry registry) {
    	registry.addViewController("/home").setViewName("myhome");
        registry.addViewController("/hello").setViewName("helloworld");
        registry.addRedirectViewController("/home", "/hello");
        registry.addStatusController("/detail", HttpStatus.BAD_REQUEST);    
        1. When we access URL /hello then helloworld.jsp will run. 
        2. When we access URL /home then helloworld.jsp will run because it will be redirected to the URL /hello. 
        3. When we access URL /detail then we will get header response with 400 HTTP status code. 

	}*/
    
    @Bean
    public InternalResourceViewResolver setupViewResolver()  {
        InternalResourceViewResolver resolver =  new InternalResourceViewResolver();
        //resolver.setPrefix ("/WEB-INF/");
        //resolver.setSuffix (".html");
        //resolver.setSuffix (".jsp");
        //resolver.setViewClass (JstlView.class);
        return resolver;
    }
    
    

}
