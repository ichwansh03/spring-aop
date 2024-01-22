package com.ichwan.configproperties;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

    @Pointcut("target(com.ichwan.configproperties.SpringConfigPropertiesApplication)")
    public void helloServiceMethod() {

    }

    @Before("helloServiceMethod()")
    public void before() {

        System.out.println("Before call hello service method");
    }
}
