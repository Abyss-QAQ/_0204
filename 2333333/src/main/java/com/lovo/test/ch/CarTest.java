package com.lovo.test.ch;

public class CarTest {
    public static void main(String[] args) {
        BenChiBuild benChiBuild=new BenChiBuild();
        String benchi=benChiBuild.buildCarModel("奔驰引擎","奔驰车轮","奔驰车架").getCarTwo();
        System.out.println(benchi);

        System.out.println("------------------------");
        BaoMaBuild baoMaBuild=new BaoMaBuild();
        String baoma=baoMaBuild.buildCarModel("宝马引擎","宝马车轮","宝马车架").getCarTwo();
        System.out.println(baoma);
    }
}
