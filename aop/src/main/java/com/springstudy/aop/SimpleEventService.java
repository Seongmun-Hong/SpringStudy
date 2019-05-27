package com.springstudy.aop;

import org.springframework.stereotype.Service;

@Service
public class SimpleEventService implements EventService {

    @PerformanceLogging
    @Override
    public void createEvent() {
        // long beginTime = System.currentTimeMillis();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Created an event");
        // System.out.println(System.currentTimeMillis() - beginTime);
        // 이렇게 작성하는 것이 crosscutting concern !!
    }

    @PerformanceLogging
    public void publishEvent() {
//        long beginTime = System.currentTimeMillis();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Published an event");
//        System.out.println(System.currentTimeMillis() - beginTime);
    }

    @Override
    public void deleteEvent() {
        System.out.println("Deleted an event");
    }
}
