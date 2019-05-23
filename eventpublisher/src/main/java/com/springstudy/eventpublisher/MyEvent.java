package com.springstudy.eventpublisher;

import org.springframework.context.ApplicationEvent;

public class MyEvent {

    private Object source;
    private int data;

    public MyEvent(Object source, int data) {
        this.source = source;
        this.data = data;
    }

    public Object getSource() {
        return source;
    }

    public int getData() {
        return data;
    }

}
