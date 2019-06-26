package com.example.canyuva;

public class EngineCreator {
    private Engine _engine;
    private static EngineCreator ec = null;

    private EngineCreator(){}
    private EngineCreator(Engine engine){
        this._engine = engine;
    }

    public static EngineCreator getEngineInst(Engine engine){
        if(ec == null){
            ec = new EngineCreator(engine);
        }

        return ec;
    }

    public void callEngine(){
        _engine.getEngine();
    }



}
