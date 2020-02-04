package com.lovo.test.whq;

public class CarTest {
    public static void main(String[] args) {
        BenChiBuild benChiBuild=new BenChiBuild();
        String benchi=benChiBuild.buildCarModel("奔驰引擎","奔驰车轮","奔驰车架").getCarTwo();
        System.out.println(benchi);

        System.out.println("------------------------");
        WuLingBuild baoMaBuild=new WuLingBuild();
        String baoma=baoMaBuild.buildCarModel("五菱宏光引擎","五菱宏光车轮","五菱宏光车架").getCarTwo();
        System.out.println(baoma);
    }
}
