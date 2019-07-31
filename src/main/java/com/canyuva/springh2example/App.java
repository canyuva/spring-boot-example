package com.canyuva.springh2example;

import com.canyuva.springh2example.dto.Car;
import com.canyuva.springh2example.dto.Engine;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.Scanner;

@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)
@ComponentScan
public class App {

    private static ApplicationContext applicationContext;
    private static final Logger logger = LoggerFactory.getLogger(App.class);
    private static Car car;
    private static Engine engine;


    @SuppressWarnings("resource")
    public static void main(String[] args) {

        applicationContext = new AnnotationConfigApplicationContext(App.class);

        Scanner sc = new Scanner(System.in);

        CarCreator cc = applicationContext.getBean(CarCreator.class);

        car = new Car();
        engine = new Engine();

        logger.debug("\nChoose a brand... \n 1- Volvo \n 2- Mercedes");

        switch (sc.nextInt()) {
            case 1:
                car.setBrand("Volvo");
                break;
            case 2:
                car.setBrand("Mercedes");
                break;

            default:
                logger.error("Unexpected input!");
                return;

        }

        logger.debug("\nChoose an engine... \n 1- Diesel \n 2- Gasoline");

        switch (sc.nextInt()) {
            case 1:
                //
                car.setEngine(new Engine());
                break;
            case 2:
                //
                car.setEngine(new Engine());
                break;

            default:
                logger.error("Unexpected input!");
                break;
        }

        logger.debug("\nSet the year...");

        if(sc.nextInt() <= 2019){
            car.setYear(sc.nextInt());
        }else{
            logger.error("The year must be smaller than 2019");
        }


    }

}
