package com.springstudy.eventpublisher;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import javax.jws.Oneway;

@Component
public class MyEventHandler {

    @EventListener
    @Async
    public void myHandler(MyEvent myEvent) {
        System.out.println(Thread.currentThread().toString());
        System.out.println("이벤트를 받았습니다. 데이터는 = " + myEvent.getData());
    }

    @EventListener
    @Async
    public void handle(ContextRefreshedEvent event) {
        System.out.println("ContextRefreshedEvent");
    }

    @EventListener
    @Async
    public void handle(ContextClosedEvent event) {
        System.out.println("ContextClosedEvent");
    }

}
