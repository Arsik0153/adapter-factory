package com.company;

public class Adapter implements MicroUSB{
    private TypeC charger;

    public void charge() {
        charger.charge();
    }
}
