package com.springstudy.validation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.util.Arrays;

@Component
public class AppRunner implements ApplicationRunner {

    @Autowired
    Validator validator;

    @Override
    public void run(ApplicationArguments args) throws Exception {

//        Event event = new Event();
//        EventValidator eventValidator = new EventValidator();
//        Errors errors = new BeanPropertyBindingResult(event, "event");
//        // 실제로 Errors라는 interface는 자주 보겠지만 BeanPropertyBindingResult과 같은 구현체는
//        // Spring mvc가 자동으로 생성해서 parameter에 전달해 줄 것이기 때문에 직접 사용할일은 없을 것이다.
//
//        eventValidator.validate(event, errors);
//
//        System.out.println(errors.hasErrors());
//
//        errors.getAllErrors().forEach( e -> {
//            System.out.println("===== error code =====");
//            Arrays.stream(e.getCodes()).forEach(System.out::println);
//            System.out.println(e.getDefaultMessage());
//        });


        //////////////////////////////////////////////////////////////////////////////////////

        System.out.println(validator.getClass());

        Event event = new Event();
        event.setLimit(-1);
        event.setEmail("seongmun");
        Errors errors = new BeanPropertyBindingResult(event, "event");

        validator.validate(event, errors);

        System.out.println(errors.hasErrors());

        errors.getAllErrors().forEach( e -> {
            System.out.println("===== error code =====");
            Arrays.stream(e.getCodes()).forEach(System.out::println);
            System.out.println(e.getDefaultMessage());
        });

    }

}
