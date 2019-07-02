package com.example.canyuva;

interface Engine {
    String getName();
    void setName();
}


class DieselEngine implements Engine{

    private String name;

    @Override
    public String getName() {
        setName();
        return name;
    }

    @Override
    public void setName() {
        this.name = "Diesel";
    }
}

class GasolineEngine implements Engine{

    private String name;

    @Override
    public String getName() {
        setName();
        return name;
    }

    @Override
    public void setName() {
        this.name = "Gasoline";
    }

}
