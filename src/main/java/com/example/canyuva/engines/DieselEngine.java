package com.example.canyuva.engines;

import org.springframework.stereotype.Component;

@Component("diesel")
public class DieselEngine implements Engine{

    @Override
    public String getName() {
        return "Diesel";
    }

}