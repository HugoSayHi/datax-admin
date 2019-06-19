package com.yuguo.dataxadminweb.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @className: MyMvcConfig
 * @Authors: yuguo
 * @Date: 2019/6/18
 * @Description:
 **/
@Configuration
public class MyMvcConfig extends WebMvcConfigurerAdapter {


    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //将所有/static/** 访问都映射到classpath:/static/ 目录下
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/webapp/static/");
        registry.addResourceHandler("/**").addResourceLocations("classpath:/webapp/");
    }

}
