package com.springstudy.beandemo;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Single {

    @Autowired
    ObjectProvider<Proto> proto;

    @Autowired
    ApplicationContext applicationContext;

    public Proto getProto() {
        return proto.getIfAvailable();
    }

}
