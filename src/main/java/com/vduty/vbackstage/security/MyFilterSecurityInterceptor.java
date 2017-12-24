package com.vduty.vbackstage.security;


import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.vduty.vbackstage.utils.HttpUtils;

import VdutySecurity.VsInterceptor;

@Component
@WebFilter("/vdutymanager/*")
public class MyFilterSecurityInterceptor extends VsInterceptor implements Filter {
    private final Logger log = LoggerFactory.getLogger(getClass());
 

    @Override
    public void destroy() {
        log.info("" + getClass() + " destroy");

    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse rep, FilterChain chain) throws IOException, ServletException {
       
    	HttpServletRequest request = (HttpServletRequest)req;
    	
    	log.info(HttpUtils.getCurUrl(request));
    	
        chain.doFilter(req, rep);

    }

    @Override
    public void init(FilterConfig arg0) throws ServletException {
        log.info("" + getClass() + " init");

    }

}