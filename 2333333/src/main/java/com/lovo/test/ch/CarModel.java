package com.lovo.test.ch;

public abstract class CarModel {
    //获得引擎
    public abstract void getEngine();
    //获得车轮
    public abstract void getWheels();
    //获得车架
    public abstract void getCar();

    final public String getCarTwo(){
        this.getCar();
        this.getEngine();
        this.getWheels();
        return "获得车";
    }

}
