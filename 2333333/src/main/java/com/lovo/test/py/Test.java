package com.lovo.test.py;

public class Test {

    public static void main(String[] args) {
        BenzBuilder benzBuilder = new BenzBuilder();
        String benz = benzBuilder.buildCarModel("奔驰引擎", "奔驰车轮", "奔驰车架").getCar();
        System.out.println(benz);
        System.out.println("-------------");
        BWMBuilder bwmBuilder = new BWMBuilder();
        String bwm = bwmBuilder.buildCarModel("宝马引擎", "宝马车轮", "宝马车架").getCar();
        System.out.println(bwm);
    }
}
