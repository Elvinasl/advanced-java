package com.codeacademy.polymorphism_example.vehicle;

import com.codeacademy.polymorphism_example.Type;
import com.codeacademy.polymorphism_example.Vehicle;

import java.util.Random;

public class Ship extends Vehicle {


    public Ship() {
        super(Type.NO_WHEEL);
    }

    @Override
    public String go() {
        return "Ship is moving!";
    }

    public int catchFish() {
        Random rd = new Random();
        return rd.nextInt(5);
    }

    @Override
    public String horn() {
        return super.horn() + " PEEEEEP!!! PEEEEEEEEEP!!!!";
    }
}
