package model.visitor;

import exception.InvalidAgeException;
import model.attraction.Attraction;

import java.util.List;

import static util.Constants.ADULT_AGE;

public class Child extends Visitor {
    public Child(int age, List<Attraction> attractions) {
        super(age, attractions);
        validateAge();
    }

    private void validateAge() {
        if (getAge() >= ADULT_AGE) {
            throw new InvalidAgeException();
        }
    }
}
