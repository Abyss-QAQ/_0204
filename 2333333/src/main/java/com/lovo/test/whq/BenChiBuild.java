package com.lovo.test.whq;

public class BenChiBuild extends CarBuild {
    @Override
    public CarModel buildCarModel(String Engine, String Wheels, String Car) {
        BenChiModel benChiModel=new BenChiModel();
        benChiModel.setCar(Car);
        benChiModel.setEngine(Engine);
        benChiModel.setWheels(Wheels);
        return benChiModel;
    }
}
