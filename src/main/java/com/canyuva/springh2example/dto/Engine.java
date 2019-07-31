package com.canyuva.springh2example.dto;

import org.springframework.stereotype.Component;

@Component
public class Engine {
    private int id;
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



