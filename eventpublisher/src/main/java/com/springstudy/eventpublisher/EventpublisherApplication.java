package com.springstudy.eventpublisher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class EventpublisherApplication {

    public static void main(String[] args) {
        SpringApplication.run(EventpublisherApplication.class, args);
    }

}
