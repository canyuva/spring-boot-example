package com.canyuva.springh2example.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EngineAspect {

    private static final Logger logger = LoggerFactory.getLogger(EngineAspect.class);

    @Before("execution(* com.canyuva.springh2example.dto.Car.setEngine(..))")
    public void beforeSelectEngine(JoinPoint joinPoint) {
        logger.info(joinPoint.getSignature().getName() + " method called!");
        logger.info("Engine injected!");
    }
}