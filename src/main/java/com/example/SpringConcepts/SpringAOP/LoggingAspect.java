package com.example.SpringConcepts.SpringAOP;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    // Joinpoint - execution
    @Before("execution(public String getName())")
    public void logActivityBeforeMethodCallAdviceExecutin() {
        System.out.println("***** LoggingAspect.logActivityBeforeMethodCallAdvice ");
    }

    // Pointcut - Annotation based aspect
    @Pointcut("@annotation(LogActivity)")
    public void logActivityPointCut() {
        System.out.println("ttt test");
    }

    @Before("logActivityPointCut()")
    public void logActivityBeforeMethodCallAdvice() {
        System.out.println("LoggingAspect.logActivityBeforeMethodCallAdvice ");
    }

    @After("logActivityPointCut()")
    public void logActivityAfterMethodCallAdvice(JoinPoint joinPoint) {
        System.out.println("LoggingAspect.logActivityAfterMethodCallAdvice " + joinPoint.getSignature().getName());
    }

}
