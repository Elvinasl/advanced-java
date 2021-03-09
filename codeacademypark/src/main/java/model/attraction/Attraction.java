package model.attraction;

public abstract class Attraction implements AttractionWithAge, Nameble {

    private Integer minAge;

    public Attraction() {
    }

    public Attraction(Integer minAge) {
        this.minAge = minAge;
    }

    public Integer getMinAge() {
        return minAge;
    }
}
