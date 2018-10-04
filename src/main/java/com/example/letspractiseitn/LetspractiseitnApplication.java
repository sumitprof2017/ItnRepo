package com.example.letspractiseitn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
//import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@ComponentScan("com.test.itn")
//@EntityScan("com.test.model")
@EntityScan(basePackages ={"com.test.model","com.rediff.model","com"})
@EnableJpaRepositories("com.test.repository")
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