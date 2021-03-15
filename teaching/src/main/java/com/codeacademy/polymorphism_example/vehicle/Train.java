package com.codeacademy.polymorphism_example.vehicle;

import com.codeacademy.polymorphism_example.Type;
import com.codeacademy.polymorphism_example.Vehicle;

public class Train extends Vehicle {

    private int numberOfWagons;

    public Train(int numberOfWagons) {
        super(Type.NO_WHEEL);
        this.numberOfWagons = numberOfWagons;
    }

    public int getNumberOfWagons() {
        return numberOfWagons * 99;
    }

    public String makeLoudHorn() {
        return super.horn() + this.horn() + this.horn();
    }

    @Override
    public String go() {
        return "Train is moving!";
    }

    @Override
    public String horn() {
        return " BOOOOOOOM!!!!";
    }
}
