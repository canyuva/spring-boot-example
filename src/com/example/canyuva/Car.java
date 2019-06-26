package com.example.canyuva;

public interface Car {
    void setEngine(String s);

}

class Volvo implements  Car{

    //private EngineCreator ec;

    @Override
    public void setEngine(String s) {
        if(s.equals("diesel")){
            System.out.println("Car : Volvo");
            EngineCreator.INSTANCE.createEngine(new DieselEngine());
            EngineCreator.INSTANCE.callEngine();
        }else{
            System.out.println("Car : Volvo");
            EngineCreator.INSTANCE.createEngine(new GasolineEngine());
            EngineCreator.INSTANCE.callEngine();
        }
    }
}


class Mercedes implements  Car{

    //private EngineCreator ec;

    @Override
    public void setEngine(String s) {
        if(s.equals("diesel")){
            System.out.println("Car : Mercedes");
            EngineCreator.INSTANCE.createEngine(new GasolineEngine());
            EngineCreator.INSTANCE.callEngine();
        }else{
            System.out.println("Car : Mercedes");
            EngineCreator.INSTANCE.createEngine(new GasolineEngine());
            EngineCreator.INSTANCE.callEngine();
        }
    }
}
