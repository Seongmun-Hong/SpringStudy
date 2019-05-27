package com.springstudy.aop;

import java.lang.annotation.*;

@Documented // javadoc 만들때 Dacumantation 될 수 있게 만듬.
@Target(ElementType.METHOD) // 타겟은 메서드
@Retention(RetentionPolicy.CLASS) // - Default가 CLASS
// Annotation에서  RetentionPolicy는 Annotation 정보를 얼마나 유지할 것인가 ? (Class File에 유지)
// RetentionPolicy.SOURCE 컴파일 하면 사라짐
public @interface PerformanceLogging {
}
