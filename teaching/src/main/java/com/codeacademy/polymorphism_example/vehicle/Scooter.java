package com.codeacademy.polymorphism_example.vehicle;

import com.codeacademy.polymorphism_example.ScooterBrand;
import com.codeacademy.polymorphism_example.Type;
import com.codeacademy.polymorphism_example.Vehicle;

public class Scooter extends Vehicle {

    private ScooterBrand brand;

    public Scooter(ScooterBrand brand) {
        super(Type.TWO_WHEEL);
        this.brand = brand;
    }

    public ScooterBrand getBrand() {
        return brand;
    }

    @Override
    public String go() {
        return "Beeeeeeen eeeeeeen... Scooter is slowly moving.";
    }
}
