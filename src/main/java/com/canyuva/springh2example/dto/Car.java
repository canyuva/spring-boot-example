package com.canyuva.springh2example.dto;

import javax.persistence.*;

@Entity
@Table(name = "CAR")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="CAR_ID")
    private int id;
    @Column(name="CAR_BRAND")
    private String brand;

    @ManyToOne
    @JoinColumn(name = "CAR_ENGINE_FK")
    private Engine engine;
    @Column(name="CAR_YEAR")
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

    @Override
    public String toString(){
        return "ID : " + getId() + "\n" +
                "BRAND : " + getBrand() + "\n" +
                "ENGINE : " + getEngine().getType() + "\n" +
                "YEAR : " + getYear() +"\n --------";
    }
}




