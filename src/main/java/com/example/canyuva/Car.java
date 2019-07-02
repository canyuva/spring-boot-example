package com.example.canyuva;

import org.springframework.beans.factory.annotation.Autowired;

public interface Car {
    void setEngine(Engine e);
    Engine getEngine();
}

class Volvo implements  Car {

    @Autowired
    private Engine e;


    @Override
    public void setEngine(Engine e) {
        this.e = e;
        System.out.println("Car : Volvo");
        System.out.println("Engine : " + this.e.getName());
    }

    @Override
    public Engine getEngine() {
        return this.e;
    }

}

    class Mercedes implements Car {

        @Autowired
        private Engine e;

        @Override
        public void setEngine(Engine e) {
            this.e = e;
            System.out.println("Car : Mercedes");
            System.out.println("Engine : " + this.e.getName());
        }

        @Override
        public Engine getEngine() {
            return this.e;
        }
    }

