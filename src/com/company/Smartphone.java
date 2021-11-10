package com.company;

public class Smartphone {
    private MicroUSB microUSB;

    public Smartphone(MicroUSB microUSB){
        this.microUSB = microUSB;
    }

    public void charge() {
        System.out.println("Charging smartphone");
        microUSB.charge();
        System.out.println("100%");
    }
}
