package com.alioth.filter;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;

import lombok.extern.slf4j.Slf4j;

/**
 * @author ZhaoYanqi
 * @date 2021/4/20 0020
 */
@Slf4j
@WebFilter(filterName = "myFilter", urlPatterns = "/world")
public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("MyFilter init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.info("MyFilter doFilter");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        log.info("MyFilter destroy");
    }
}
