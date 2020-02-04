package com.lovo.test.whq;

public class WuLingBuild extends CarBuild {
    @Override
    public CarModel buildCarModel(String Engine, String Wheel, String Car) {
        BenChiModel benChiModel=new BenChiModel();
        benChiModel.setCar(Car);
        benChiModel.setEngine(Engine);
        benChiModel.setWheels(Wheel);
        return benChiModel;
    }
}
