package com.codeacademy.polymorphism_example.vehicle;

import com.codeacademy.polymorphism_example.Driver;
import com.codeacademy.polymorphism_example.Type;
import com.codeacademy.polymorphism_example.Vehicle;

public class Bus extends Vehicle {

    private Driver driver;

    public Bus(Driver driver) {
        super(Type.FOUR_WHEEL);
        this.driver = driver;
    }

    public Driver getDriver() {
        return driver;
    }

    @Override
    public String go() {
        return "Whop whop angry bus driver is approaching!";
    }
}
