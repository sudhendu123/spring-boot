package com.springweb.jar.config;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.GenericFilterBean;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * CORS Filter
 *
 * This filter is an implementation of W3C's CORS
 * (Cross-Origin Resource Sharing) specification,
 * which is a mechanism that enables cross-origin requests.
 *
 */
//either we can use companent scan or create a bean of this
//@Component
//@Order(value=1)
public class CORSFilter extends GenericFilterBean implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        HttpServletResponse httpResponse = (HttpServletResponse) response;
        httpResponse.setHeader("Access-Control-Allow-Origin", "*");
        httpResponse.setHeader("Access-Control-Allow-Methods", "*");
//        httpResponse.setHeader("Access-Control-Allow-Methods", "POST, GET, PUT, OPTIONS, DELETE");

        httpResponse.setHeader("Access-Control-Allow-Headers", "*");
//        httpResponse.setHeader("Access-Control-Allow-Headers",
//                "Origin, X-Requested-With, Content-Type, Accept, X-Auth-Token, X-Csrf-Token, Authorization");

        httpResponse.setHeader("Access-Control-Allow-Credentials", "false");
        httpResponse.setHeader("Access-Control-Max-Age", "3600");

        System.out.println("********** CORS Configuration Completed **********");

        chain.doFilter(request, response);
    }


} // The End...