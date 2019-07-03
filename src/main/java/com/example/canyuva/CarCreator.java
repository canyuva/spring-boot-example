package com.example.canyuva;


import com.example.canyuva.cars.Car;
import com.example.canyuva.cars.Mercedes;
import com.example.canyuva.cars.Volvo;
import com.example.canyuva.engines.DieselEngine;
import com.example.canyuva.engines.GasolineEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
class CarCreator {

    private ApplicationContext app;
    private Car car;
    private static CarCreator cc;

    public static CarCreator getInstance(){
        if(cc == null){
            return new CarCreator();
        }

        return cc;
    }

    @Autowired
    @Qualifier("volvo")
    private Volvo volvo;

    @Autowired
    @Qualifier("mercedes")
    private Mercedes mercedes;


    public void selectCar(int select) {

        app = new AnnotationConfigApplicationContext(AppConfig.class);

        if (select == 1) {
            volvo = app.getBean(Volvo.class);
            this.car = volvo;
        } else {
            mercedes = app.getBean(Mercedes.class);
            this.car = mercedes;
        }

    }

    public void selectEngine(int select) {
        if (select == 1) {
            this.car.setEngine(app.getBean(DieselEngine.class));
        } else {
            this.car.setEngine(app.getBean(GasolineEngine.class));
        }

    }
}