package com.lovo.test.py;

public class BWMBuilder extends CarBuilder{

    @Override
    public CarModel buildCarModel(String engine, String wheel, String frame) {
        BWMModel bwm = new BWMModel();
        bwm.setEngine(engine);
        bwm.setWheel(wheel);
        bwm.setFrame(frame);
        return bwm;
    }
}
