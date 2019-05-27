package com.springstudy.aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AopApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(AopApplication.class);
        app.setWebApplicationType(WebApplicationType.NONE);
        app.run();
        // Web Application으로 실행하지 않고 그냥 실행하도록 바꿈
    }

}
