/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 *
 * @author didin
 */
@Configuration
public class PageConfig implements WebMvcConfigurer {

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        return bCryptPasswordEncoder;
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/dashboard").setViewName("dashboard");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/shoppingcart").setViewName("shoppingcart");
        registry.addViewController("/checkoutform").setViewName("checkoutform");
        registry.addViewController("/payment").setViewName("payment");
registry.addViewController("/about").setViewName("about");
        registry.addViewController("/feedbackform").setViewName("feedbackform");
        registry.addViewController("/contactform").setViewName("contactform");
        registry.addViewController("/contactform").setViewName("governmentschemes");
        registry.addViewController("/index").setViewName("index");



    }

}
