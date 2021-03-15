package com.codeacademy.interface_example;

public class Donkey extends Creature implements Animal {

    private static final String SOUND = "YYY-AAAA!";

    public Donkey() {
    }

    public void serveHuman() {
        // something
    }

    @Override
    public String makeSound() {
        return SOUND;
    }

    @Override
    public String getName() {
        return this.getClass().getName();
    }

    @Override
    public String getType() {
        return "Stupid animal....";
    }

    @Override
    public Long getIdentityNumber() {
        return 1L;
    }
}
