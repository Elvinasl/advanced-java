package lt.codeacademy.polymorphism_example;

import lt.codeacademy.interface_example.Namable;

public class Driver implements Namable {

    private String name;

    public Driver(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
