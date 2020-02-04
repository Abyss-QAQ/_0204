package com.lovo.test.ch;

public class BaoMaModel extends CarModel{
    private String Engine;
    private String Wheels;
    private String Car;
    @Override
    public void getEngine() {
        System.out.println(Engine);
    }

    @Override
    public void getWheels() {
        System.out.println(Wheels);
    }

    @Override
    public void getCar() {
        System.out.println(Car);
    }

    public void setEngine(String engine) {
        Engine = engine;
    }

    public void setWheels(String wheels) {
        Wheels = wheels;
    }

    public void setCar(String car) {
        Car = car;
    }
}
