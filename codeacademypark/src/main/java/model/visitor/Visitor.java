package model.visitor;

import model.attraction.Attraction;

import java.util.List;

public abstract class Visitor implements Ageble {

    private int age;
    private List<Attraction> attractions;

    public Visitor(int age, List<Attraction> attractions) {
        this.age = age;
        this.attractions = attractions;
    }

    public List<Attraction> getAttractions() {
        return attractions;
    }

    @Override
    public int getAge() {
        return age;
    }
}
