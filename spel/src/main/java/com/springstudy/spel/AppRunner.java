package com.springstudy.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {

    @Value("#{1 + 1}")
    int value;

    @Value("#{'Hello' + 'World'}")
    String greeting;

    @Value("#{1 eq 1}")
    boolean trueOrFalse;

    @Value("${my.value}")
    int myValue;

    @Value("#{${my.value} eq 100}")
    boolean isMyValue100;

    // # = 표현식을 사용
    // $ = Property를 사용
    // 표현식 안에는 Property를 사용할 수 있지만 Property 안에 표현식은 사용할 수 없다.

    @Value("#{sampleBean.data}")
    int sampleBeanData;

    @Value("#{sampleBean.getData()}")
    int sampleBeanData2;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("========Application Runner========");
        System.out.println(value);
        System.out.println(greeting);
        System.out.println(trueOrFalse);
        System.out.println(myValue);
        System.out.println(isMyValue100);
        System.out.println(sampleBeanData);
        System.out.println(sampleBeanData2);

        ExpressionParser parser = new SpelExpressionParser();
        Expression expression = parser.parseExpression("2 + 100");
        Integer value = expression.getValue(Integer.class);
        // 이 때 converter를 사
        System.out.println(value);
    }

}
