package com.example.letspractiseitn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
//import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan("com.test.itn")
@SpringBootApplication
public class LetspractiseitnApplication extends SpringBootServletInitializer {

    
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder 
            application) {
        
        return application.sources(LetspractiseitnApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(LetspractiseitnApplication.class, args);
    }
}