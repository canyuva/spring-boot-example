package com.example.canyuva;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Scanner;

@Configuration
@ComponentScan
public class App {

    private static ApplicationContext applicationContext;


    @SuppressWarnings("resource")
    public static void main(String[] args) {

        applicationContext = new AnnotationConfigApplicationContext(App.class);

        Scanner sc = new Scanner(System.in);

        CarCreator cc = applicationContext.getBean(CarCreator.class);

        System.out.println("Choose a car... \n 1- Volvo \n 2- Mercedes");

        switch (sc.nextInt()) {
            case 1:
                cc.selectCar(1);
                break;
            case 2:
                cc.selectCar(2);
                break;

            default:
                System.out.println("error");
                return;

        }

        System.out.println("Choose an engine... \n 1- Diesel \n 2- Gasoline");

        switch (sc.nextInt()) {
            case 1:
                cc.selectEngine(1);
                break;
            case 2:
                cc.selectEngine(2);
                break;

            default:
                System.out.println("error");
                break;
        }

    }

}
