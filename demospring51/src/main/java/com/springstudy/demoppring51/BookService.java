package com.springstudy.demoppring51;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class BookService implements InitializingBean {

    @Autowired
    BookRepository bookRepository;

    @Override
    public void afterPropertiesSet() throws Exception {
        // Do Something..
    }

}