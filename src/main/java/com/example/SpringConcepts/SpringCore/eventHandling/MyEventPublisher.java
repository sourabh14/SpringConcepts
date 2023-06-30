package com.example.SpringConcepts.SpringCore.eventHandling;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

@Component
public class MyEventPublisher implements ApplicationEventPublisherAware {
    ApplicationEventPublisher applicationEventPublisher;

    public ApplicationEventPublisher getApplicationEventPublisher() {
        return applicationEventPublisher;
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }
}
