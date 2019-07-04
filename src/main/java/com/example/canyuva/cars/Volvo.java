package com.example.canyuva.cars;

import com.example.canyuva.engines.Engine;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("volvo")
public class Volvo implements  Car {

    private static final Logger logger = LoggerFactory.getLogger(Volvo.class);

    @Autowired
    private Engine e;

    @Override
    public void setEngine(Engine e) {
        this.e = e;
        logger.debug("Car : Volvo");
        logger.debug("Engine : " + this.e.getName());
    }
}