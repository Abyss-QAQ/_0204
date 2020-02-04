package com.lovo.test.py;

public abstract class CarModel {

    public abstract void getEngine();
    public abstract void getWheel();
    public abstract void getFrame();

    final public String getCar(){
        this.getEngine();
        this.getWheel();
        this.getFrame();
        return "构造汽车";
    }
}
