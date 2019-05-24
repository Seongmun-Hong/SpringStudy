package com.springstudy.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class EventValidator implements Validator {

    @Override
    public boolean supports(Class<?> aClass) {
        return Event.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "title", "nonempty", "Empty title is not allowed");
        // rejectIfEmptyOrWhitespace(errors, field, errorCode, defaultMessage)
        // errorCode = message resource에서 실제 메세지를 가져오기 위한 Key
        // defaultMessage = errorCode로 사용할 메세지를 찾지 못하였을때 사용할 메세지
    }

}
