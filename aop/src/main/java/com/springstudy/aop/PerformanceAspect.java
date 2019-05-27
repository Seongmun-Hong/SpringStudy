package com.springstudy.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PerformanceAspect {

    // Around는 메서드를 감싸는 형태로 적용된다. (메서드호출 이전, 이후, 에러가 났을때 특정한 작업 등 다용도로 쓰일 수 있는 Annotation이다.
    // Around 뒤에는 Pointcut 이름 혹은 Pointcut을 직접 정의할 수 있다.
//    @Around("execution(* com.springstudy..*.EventService.*(..))")
//    public Object logPerformance(ProceedingJoinPoint pip) throws Throwable {
//        // ProceedingJoinPoint pip 는 대상 메서드 자체를 의미
//        long beginTime = System.currentTimeMillis();
//        Object letVal = pip.proceed(); // 메서드 호출
//        System.out.println(System.currentTimeMillis() - beginTime);
//        return letVal;
//    }

    @Around("@annotation(PerformanceLogging)")
    // PerformanceLogging Annotation이 붙은 메서드에만 적용
    public Object logPerformance(ProceedingJoinPoint pip) throws Throwable {
        // ProceedingJoinPoint pip 는 대상 메서드 자체를 의미
        long beginTime = System.currentTimeMillis();
        Object letVal = pip.proceed(); // 메서드 호출
        System.out.println(System.currentTimeMillis() - beginTime);
        return letVal;
    }

//    @Around("bean(simpleEventService)")
//    // PerformanceLogging Annotation이 붙은 메서드에만 적용
//    public Object logPerformance(ProceedingJoinPoint pip) throws Throwable {
//        // ProceedingJoinPoint pip 는 대상 메서드 자체를 의미
//        long beginTime = System.currentTimeMillis();
//        Object letVal = pip.proceed(); // 메서드 호출
//        System.out.println(System.currentTimeMillis() - beginTime);
//        return letVal;
//    }
}
