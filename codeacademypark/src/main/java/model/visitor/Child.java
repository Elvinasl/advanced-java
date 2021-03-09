package model.visitor;

import model.attraction.Attraction;

import java.util.List;

public class Child extends Visitor {
    public Child(int age, List<Attraction> attractions) {
        super(age, attractions);
    }
}
