package lt.codeacademy.polymorphism_example.vehicle;

import lt.codeacademy.polymorphism_example.Driver;
import lt.codeacademy.polymorphism_example.Type;
import lt.codeacademy.polymorphism_example.Vehicle;

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
