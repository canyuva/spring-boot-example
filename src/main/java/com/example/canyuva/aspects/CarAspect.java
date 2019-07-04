package com.example.canyuva.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CarAspect {

    private static final Logger logger = LoggerFactory.getLogger(CarAspect.class);

    @After("execution(* com.example.canyuva.CarCreator.selectCar(..))")
    public void afterSelectCar(JoinPoint joinPoint) {
        logger.info(joinPoint.getSignature().getName() + " method called!");
        logger.info("Car selected!");
    }
}