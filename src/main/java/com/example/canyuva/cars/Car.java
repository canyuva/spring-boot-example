package com.example.canyuva.cars;

import com.example.canyuva.engines.Engine;
import org.springframework.stereotype.Component;

@Component
public interface Car {
    void setEngine(Engine e);
}




