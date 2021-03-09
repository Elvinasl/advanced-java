package model.attraction;

import static util.Constants.ADULT_AGE;

public class Kobolter extends Attraction {

    private static final String NAME = "Kobolter";
    private static final int MIN_AGE = ADULT_AGE;

    public Kobolter() {
        super(MIN_AGE);
    }

    @Override
    public String getName() {
        return NAME;
    }
}
