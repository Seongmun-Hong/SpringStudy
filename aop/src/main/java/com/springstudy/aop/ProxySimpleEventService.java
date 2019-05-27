//package com.springstudy.aop;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Primary;
//import org.springframework.stereotype.Service;
//
//@Primary
//@Service
//public class ProxySimpleEventService implements EventService {
//
//    @Autowired
//    SimpleEventService simpleEventService;
//
//    @Override
//    public void createEvent() {
//        long beginTime = System.currentTimeMillis();
//        simpleEventService.createEvent();
//        System.out.println(System.currentTimeMillis() - beginTime);
//    }
//
//    @Override
//    public void publishEvent() {
//        long beginTime = System.currentTimeMillis();
//        simpleEventService.publishEvent();
//        System.out.println(System.currentTimeMillis() - beginTime);
//    }
//
//    @Override
//    public void deleteEvent() {
//        simpleEventService.deleteEvent();
//    }
//}
