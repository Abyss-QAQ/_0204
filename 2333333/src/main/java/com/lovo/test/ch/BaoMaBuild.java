package com.lovo.test.ch;

public class BaoMaBuild extends CarBuild{
    @Override
    public CarModel buildCarModel(String Engine, String Wheels, String Car) {
        BenChiModel benChiModel=new BenChiModel();
        benChiModel.setCar(Car);
        benChiModel.setEngine(Engine);
        benChiModel.setWheels(Wheels);
        return benChiModel;
    }
}
