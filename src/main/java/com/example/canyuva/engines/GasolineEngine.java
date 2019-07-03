package com.example.canyuva.engines;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("gas")
@Primary
public class GasolineEngine implements Engine{

    @Override
    public String getName() {
        return "Gasoline";
    }



}