package com.codeacademy.interface_example;

public class Dog extends Creature implements Animal {

    private static final String SOUND = "AU!";

    public Dog() {
    }

    private void bringBone() {
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
    public Long getIdentityNumber() {
        return null;
    }
}
