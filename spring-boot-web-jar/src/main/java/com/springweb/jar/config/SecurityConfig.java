package com.springweb.jar.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;



@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Value("${CSP:default-src 'self'}")
	public String contentSecurityPolicy;
	@Override
	protected void configure(final HttpSecurity http) throws Exception {

		http.csrf().disable();
		//http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
		//	http.addFilterAfter(new KnWCSRSecurityFilter(),BasicAuthenticationFilter.class);
		/*http.headers().cacheControl().and()
		.frameOptions().sameOrigin()
		.contentTypeOptions().and()
		//.httpStrictTransportSecurity().and()
		.xssProtection().and()
		.referrerPolicy(ReferrerPolicy.SAME_ORIGIN)
		.and().addHeaderWriter(new StaticHeadersWriter("Content-Security-Policy",
				contentSecurityPolicy));*/
	}

	//cors configuration in spring
	//for testing the cors run the server with cors and try to hit the server with ajax request from another server.
	/*@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurerAdapter() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**")
				.allowedOrigins("http://localhost")
				.allowedMethods("GET", "POST")
				.allowedHeaders("*");
			}
		};
	}*/
	
	// cors configuration can be done this way also
	/*@Bean
    public FilterRegistrationBean corsFilterRegistration() {
        FilterRegistrationBean registrationBean =
                new FilterRegistrationBean(new CORSFilter());
        registrationBean.setName("CORS Filter");
        registrationBean.addUrlPatterns("/*");
        registrationBean.setOrder(1);
        return registrationBean;
    }*/
}
