package com.example.canyuva;

public class CarCreator {
    private Car _car;
    private EngineCreator ec;
    private static CarCreator cc = null;

    private CarCreator(){}
    private CarCreator(Car car){
        this._car = car;
    }

    public static CarCreator getCarInst(Car car){
        if(cc == null){
            cc = new CarCreator(car);
        }

        return cc;
    }

    public void selectEngine(int select){
        if(select == 1){
            _car.setEngine("diesel");
        }else{
            _car.setEngine("gasoline");
        }

    }

}

