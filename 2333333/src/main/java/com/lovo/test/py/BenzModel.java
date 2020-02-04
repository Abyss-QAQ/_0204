package com.lovo.test.py;

public class BenzModel extends CarModel{

    private String engine;
    private String wheel;
    private String frame;

    @Override
    public void getEngine() {
        System.out.println(engine);
    }

    @Override
    public void getWheel() {
        System.out.println(wheel);
    }

    @Override
    public void getFrame() {
        System.out.println(frame);
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setWheel(String wheel) {
        this.wheel = wheel;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }
}
