package com.example.canyuva;

enum CarCreator {
    INSTANCE;

    private Car car;

    private CarCreator(){}

    public void createCar(Car car){
        this.car = car;
    }

    public static CarCreator getEngineInst(){
        return INSTANCE;
    }

    public void selectEngine(int select){
        if(select == 1){
            car.setEngine("diesel");
        }else{
            car.setEngine("gasoline");
        }

    }

}

