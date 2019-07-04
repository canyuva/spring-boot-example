package com.example.canyuva;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.Scanner;

@Configuration
@ComponentScan
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class App {

    private static ApplicationContext applicationContext;
    private static final Logger logger = LoggerFactory.getLogger(App.class);



    @SuppressWarnings("resource")
    public static void main(String[] args) {



        applicationContext = new AnnotationConfigApplicationContext(App.class);

        Scanner sc = new Scanner(System.in);

        CarCreator cc = applicationContext.getBean(CarCreator.class);

        logger.debug("\nChoose a car... \n 1- Volvo \n 2- Mercedes");

        switch (sc.nextInt()) {
            case 1:
                cc.selectCar(1);
                break;
            case 2:
                cc.selectCar(2);
                break;

            default:
                logger.error("Unexpected input!");
                return;

        }

        logger.debug("\nChoose an engine... \n 1- Diesel \n 2- Gasoline");

        switch (sc.nextInt()) {
            case 1:
                cc.selectEngine(1);
                break;
            case 2:
                cc.selectEngine(2);
                break;

            default:
                logger.error("Unexpected input!");
                break;
        }

    }

}
