package com.kishkan.epam.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = {"com.kishkan.epam.config", "com.kishkan.epam.controller"})
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.jsp("/WEB-INF/pages/", ".jsp");
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //this will map uri to jsp view directly without a controller
//        registry.addViewController("/hi")
//                .setViewName("hello");
    }
}
