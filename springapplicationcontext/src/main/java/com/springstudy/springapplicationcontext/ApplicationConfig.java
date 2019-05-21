//package com.springstudy.springapplicationcontext;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration // bean을 등록하는 Configuration 이다.
////@ComponentScan(basePackages = "com.springstudy.springapplicationcontext")
////위의 방법은 type safety 하지 않으므로 아래의 방법을 추천한다.
//@ComponentScan(basePackageClasses = DemoApplication.class)
//// DemoApplication 클래스가 위치한 곳부터 scan
//public class ApplicationConfig {
//
////    @Bean
////    public BookRepository bookRepository() {
////        return new BookRepository();
////    }
////
////    @Bean
////    public BookService bookService() {
////        BookService bookService = new BookService();
//////        아래와 같이 직접 의존성을 주입하지 않아도 @Autowired를 통하여 주입할 수 있다.
//////        but BookService에 setter메서드가 있어야 가능하다 !
//////        bookService.setBookRepository(bookRepository());
////        return bookService;
////    }
//
//}
