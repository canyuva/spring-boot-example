package com.example.canyuva;

enum EngineCreator {

    INSTANCE;

    private Engine _engine;

    private EngineCreator(){}

    public void createEngine(Engine engine){
        this._engine = engine;
    }

    public static EngineCreator getEngineInst(){
        return INSTANCE;
    }

    public void callEngine(){
        _engine.getEngine();
    }



}
