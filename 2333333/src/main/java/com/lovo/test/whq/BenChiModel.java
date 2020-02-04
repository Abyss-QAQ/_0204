package com.lovo.test.whq;

public class BenChiModel extends CarModel {
    /**引擎*/
    private String Engine;
    /**车轮*/
    private String Wheel;
    /**车身*/
    private String Car;
    @Override
    public void getEngine() {
        System.out.println(Engine);
    }

    @Override
    public void getWheel() {
        System.out.println(Wheel);
    }

    @Override
    public void getCar() {
        System.out.println(Car);
    }

    public void setEngine(String engine) {
        Engine = engine;
    }

    public void setWheels(String wheel) {
        Wheel = wheel;
    }

    public void setCar(String car) {
        Car = car;
    }
}
