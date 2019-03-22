package com.mkaz.website.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/home").setViewName("home");
        registry.addViewController("/").setViewName("home");
        registry.addViewController("/feed").setViewName("feed");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/account").setViewName("account");
        registry.addViewController("/admin").setViewName("admin");
        registry.addViewController("/add").setViewName("add");
    }
}
