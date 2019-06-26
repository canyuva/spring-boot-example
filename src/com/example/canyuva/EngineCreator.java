package com.example.canyuva;

enum EngineCreator {

    INSTANCE;

    private Engine _engine;
    private static EngineCreator ec = null;

    private EngineCreator(){}

    public void createEngine(Engine engine){
        this._engine = engine;
    }

    public static EngineCreator getEngineInst(Engine engine){
        return INSTANCE;
    }

    public void callEngine(){
        _engine.getEngine();
    }



}
