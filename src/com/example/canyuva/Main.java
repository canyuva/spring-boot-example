package com.example.canyuva;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        CarCreator cc = null;
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose a car... \n 1- Volvo \n 2- Mercedes");

        switch (sc.nextInt()){
            case 1:
                cc = cc.getCarInst(new Volvo());
                break;
            case 2:
                cc = cc.getCarInst(new Mercedes());
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
