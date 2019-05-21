package com.springstudy.springapplicationcontext;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

@SpringBootApplication
// 위의 어노테이션은 ApplicationConfig에 있는 모든 내용과 main 내용을 포함
public class DemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);

////        annotation을 통한 bean 등록
//        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
////        xml을 통한  bean 등록
////        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
//        String[] beanDefinitionNames = context.getBeanDefinitionNames();
//        System.out.println(Arrays.toString(beanDefinitionNames));
//        BookService bookService = (BookService)context.getBean("bookService");
//        System.out.println(bookService.bookRepository != null);

    }

}
