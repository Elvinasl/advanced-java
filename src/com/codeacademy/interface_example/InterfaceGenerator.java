package com.codeacademy.interface_example;

import java.util.Random;

public class InterfaceGenerator {

    public InterfaceGenerator() {
    }

    public Creature generateInterface() {
        Random random = new Random();

        int randomNumber = random.nextInt(10);
        if (randomNumber < 2) {
            return new Dog();
        }

        if (randomNumber < 4) {
            return new Cow();
        }

        if (randomNumber < 8) {
            return new Person("Elvis", 49701300000L);
        }

        return new Donkey();
    }
}
