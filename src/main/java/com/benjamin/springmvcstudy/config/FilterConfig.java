package com.benjamin.springmvcstudy.config;

import com.benjamin.springmvcstudy.filter.MyFilter;
import com.benjamin.springmvcstudy.filter.ResponseHeaderFilter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.core.Ordered;

import javax.swing.*;

@ConditionalOnClass(name = "com.benjamin.springmvcstudy.filter.ResponseHeaderFilter")
@ConditionalOnBean(name = "responseHeaderFilter")
@Configuration
public class FilterConfig {

    @DependsOn(value = {"responseHeaderFilterRegistration"})
    @Bean
    public FilterRegistrationBean myFilterRegistration() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new MyFilter());
        registration.addUrlPatterns("/*");
        registration.setName("myFilterRegistration");
        registration.setOrder(Ordered.LOWEST_PRECEDENCE);
        return registration;
    }

    @Bean
    public FilterRegistrationBean responseHeaderFilterRegistration(ResponseHeaderFilter responseHeaderFilter) {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(responseHeaderFilter);
        registration.addUrlPatterns("/*");
        registration.setName("responseHeaderFilter");
        registration.setOrder(Ordered.LOWEST_PRECEDENCE - 1);
        return registration;
    }
}
