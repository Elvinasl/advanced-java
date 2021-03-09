package model.visitor;

import exception.InvalidAgeException;
import model.attraction.Attraction;

import java.util.List;


/**
 * Abstract visitor that has an age and attractions that he/she want to visit
 */
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
