package com.codeacademy.interface_example;

public interface Animal extends Namable {

    String TYPE = "Unknown animal type";

    String makeSound();

    default String getType() {
        return TYPE;
    }
}
