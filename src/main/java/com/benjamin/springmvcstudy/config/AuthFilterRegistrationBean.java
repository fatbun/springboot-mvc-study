package com.benjamin.springmvcstudy.config;

import com.benjamin.springmvcstudy.filter.ResponseHeaderFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.Filter;

@Order(10)
@Component
public class AuthFilterRegistrationBean extends FilterRegistrationBean<Filter> {

    @Override
    public Filter getFilter() {
        return new ResponseHeaderFilter();
    }

}