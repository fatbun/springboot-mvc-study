package com.benjamin.springmvcstudy.config;

import com.benjamin.springmvcstudy.filter.ResponseHeaderFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean responseHeaderFilterRegistration(ResponseHeaderFilter responseHeaderFilter) {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(responseHeaderFilter);
        registration.addUrlPatterns("/*");
        registration.setName("responseHeaderFilter");
        registration.setOrder(10);
        return registration;
    }
}
