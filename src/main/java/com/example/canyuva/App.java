package com.example.canyuva;

import java.util.Scanner;

public class App 
{
    @SuppressWarnings("resource")
    public static void main(String[] args) {

        CarCreator cc = CarCreator.getInstance();

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose a car... \n 1- Volvo \n 2- Mercedes");

        switch (sc.nextInt()){
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

        switch (sc.nextInt()){
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
