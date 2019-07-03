package com.example.canyuva.cars;

import com.example.canyuva.engines.Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("volvo")
public class Volvo implements  Car {

    @Autowired
    private Engine e;

    @Override
    public void setEngine(Engine e) {
        this.e = e;
        System.out.println("Car : Volvo");
        System.out.println("Engine : " + this.e.getName());
    }
}