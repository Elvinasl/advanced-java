package model.visitor;

import model.attraction.Attraction;

import java.util.List;

public class Adult extends Visitor {

    public Adult(int age, List<Attraction> attractions) {
        super(age, attractions);
    }
}
