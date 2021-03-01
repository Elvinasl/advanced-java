package com.codeacademy.polymorphism_example;

public abstract class Vehicle {

    protected Type type;

    public Vehicle(Type type) {
        this.type = type;
    }

    public abstract String go();

    public String horn() {
        return "beeeep";
    }

    public Type getType() {
        return type;
    }
}
