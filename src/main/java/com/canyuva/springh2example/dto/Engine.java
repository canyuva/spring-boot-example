package com.canyuva.springh2example.dto;

import javax.persistence.*;

@Entity
@Table(name = "ENGINE")
public class Engine {
    @Id
    @GeneratedValue
    @Column(name="ENGINE_ID")
    private int id;
    @Column(name="ENGINE_TYPE")
    private String type;

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setId(int id) {
        this.id = id;
    }
}



