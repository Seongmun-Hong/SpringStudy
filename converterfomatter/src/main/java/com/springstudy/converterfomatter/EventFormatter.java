package com.springstudy.converterfomatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Locale;

//@Component  Thread Safe하기 때문에 Bean으로 만들 수 있다.
public class EventFormatter implements Formatter<Event> {

    // @Autowired
    // MessageSource messageSource;

    @Override
    public Event parse(String s, Locale locale) throws ParseException {
        return new Event(Integer.parseInt(s));
    }

    @Override
    public String print(Event event, Locale locale) {
        // messageSource.getMessage("title", locale);
        // 위의 주석과 같이 Bean으로 만들면 MessageSource를 가져와서
        // locale에 따른 처리가 가능하다.
        return event.getId().toString();
    }

}
