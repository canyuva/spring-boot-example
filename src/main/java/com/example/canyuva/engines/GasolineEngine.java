package com.example.canyuva.engines;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("gas")
@Primary
public class GasolineEngine implements Engine{

    private String name;

    @Override
    public String getName() {
        return "Gasoline";
    }



}