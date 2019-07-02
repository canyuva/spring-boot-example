package com.example.canyuva;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class App 
{
    @SuppressWarnings("resource")
    public static void main(String[] args) {

        // loading the definitions from the given XML file
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        CarCreator app = context.getBean(CarCreator.class);

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose a car... \n 1- Volvo \n 2- Mercedes");

        switch (sc.nextInt()){
            case 1:
                app.createCar(new Volvo());
                break;
            case 2:
                app.createCar(new Mercedes());
                break;

            default:
                System.out.println("error");
                return;

        }

        System.out.println("Choose an engine... \n 1- Diesel \n 2- Gasoline");

        switch (sc.nextInt()){
            case 1:
                app.selectEngine(1);
                break;
            case 2:
                app.selectEngine(2);
                break;

            default:
                System.out.println("error");
                break;
        }

    }

}
