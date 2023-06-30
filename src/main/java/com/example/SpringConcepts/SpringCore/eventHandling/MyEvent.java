package com.example.SpringConcepts.SpringCore.eventHandling;

import java.time.Clock;

import org.springframework.context.ApplicationEvent;

public class MyEvent extends ApplicationEvent {
    public MyEvent(Object source) {
        super(source);
    }

    public MyEvent(Object source, Clock clock) {
        super(source, clock);
    }

    @Override
    public String toString() {
        return "MyEvent from package com.example.SpringHibernateConcepts.SpringCore.eventHandling";
    }
}
