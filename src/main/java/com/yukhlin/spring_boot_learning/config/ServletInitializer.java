package com.yukhlin.spring_boot_learning.config;

import com.yukhlin.spring_boot_learning.SpringBootLearningApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringBootLearningApplication.class);
    }

}

