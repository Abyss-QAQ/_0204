package com.lovo.test.whq;

public class WuLingModel extends CarModel {
    private String Engine;
    private String Wheel;
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
