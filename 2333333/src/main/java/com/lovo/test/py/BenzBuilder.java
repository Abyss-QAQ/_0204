package com.lovo.test.py;

public class BenzBuilder extends CarBuilder{

    @Override
    public CarModel buildCarModel(String engine, String wheel, String frame) {
        BenzModel benz = new BenzModel();
        benz.setEngine(engine);
        benz.setWheel(wheel);
        benz.setFrame(frame);
        return benz;
    }
}
