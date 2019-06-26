package com.example.canyuva;

public interface Car {
    void setEngine(String s);

}

class Volvo implements  Car{

    private EngineCreator ec;

    @Override
    public void setEngine(String s) {
        if(s.equals("diesel")){
            System.out.println("Car : Volvo");
            ec = EngineCreator.getEngineInst(new DieselEngine());
            ec.callEngine();
        }else{
            System.out.println("Car : Volvo");
            ec = EngineCreator.getEngineInst(new GasolineEngine());
            ec.callEngine();
        }
    }
}


class Mercedes implements  Car{

    private EngineCreator ec;

    @Override
    public void setEngine(String s) {
        if(s.equals("diesel")){
            System.out.println("Car : Mercedes");
            ec = EngineCreator.getEngineInst(new DieselEngine());
            ec.callEngine();
        }else{
            System.out.println("Car : Mercedes");
            ec = EngineCreator.getEngineInst(new GasolineEngine());
            ec.callEngine();
        }
    }
}
