package com.example.canyuva;


import com.example.canyuva.cars.Car;
import com.example.canyuva.cars.Mercedes;
import com.example.canyuva.cars.Volvo;
import com.example.canyuva.engines.DieselEngine;
import com.example.canyuva.engines.GasolineEngine;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
class CarCreator {
    private static final Logger logger = Logger.getLogger(CarCreator.class);
    private Car car;

    @Autowired
    @Qualifier("volvo")
    private Volvo volvo;

    @Autowired
    @Qualifier("mercedes")
    private Mercedes mercedes;

    @Autowired
    @Qualifier("diesel")
    private DieselEngine dieselEngine;

    @Autowired
    @Qualifier("gas")
    private GasolineEngine gasolineEngine;


    public void selectCar(int select) {
        logger.info("Car created");
        if (select == 1) {
            this.car = volvo;
        } else {
            this.car = mercedes;
        }

    }

    public void selectEngine(int select) {
        logger.info("Engine injected");
        if (select == 1) {
            this.car.setEngine(dieselEngine);
        } else {
            this.car.setEngine(gasolineEngine);
        }

    }
}