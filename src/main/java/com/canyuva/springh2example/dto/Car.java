package com.canyuva.springh2example.dto;

import org.springframework.stereotype.Component;
import com.canyuva.springh2example.dto.*;
@Component
public class Car {
    private int id;
    private String brand;
    private Engine engine;
    private int year;

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setId(int id) {
        this.id = id;
    }
}




