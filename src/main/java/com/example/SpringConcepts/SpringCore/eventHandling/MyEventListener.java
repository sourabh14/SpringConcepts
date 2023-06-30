package com.example.SpringConcepts.SpringCore.eventHandling;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MyEventListener implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("MyEventListener.onApplicationEvent : " + event.toString());
    }
}
