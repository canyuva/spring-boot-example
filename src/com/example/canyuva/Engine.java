package com.example.canyuva;

interface Engine {
    void getEngine();
}

class DieselEngine implements Engine{
    @Override
    public void getEngine() {
        System.out.println("Engine : Diesel");
    }
}

class GasolineEngine implements Engine{


    @Override
    public void getEngine() {
        System.out.println("Engine : Gasoline");
    }
}
