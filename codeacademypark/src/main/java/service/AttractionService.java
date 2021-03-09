package service;

import model.attraction.Attraction;
import model.attraction.BackerJumbo;
import model.attraction.FrontEnderer;
import model.attraction.Kobolter;

import java.util.ArrayList;
import java.util.List;

import static util.Constants.ADULT_AGE;

/**
 * Service which is responsible for managing all attraction park attractions
 */
public class AttractionService {

    private Attraction backerJumbo;
    private Attraction frontEnderer;
    private Attraction kobolter;

    public AttractionService() {
        this.backerJumbo = new BackerJumbo();
        this.frontEnderer = new FrontEnderer();
        this.kobolter = new Kobolter();
    }

    /**
     * @return List of all available attractions
     */
    public List<Attraction> getAllAttractions() {
        List<Attraction> attractions = new ArrayList<>();
        attractions.add(backerJumbo);
        attractions.add(frontEnderer);
        attractions.add(kobolter);
        return attractions;
    }

    /**
     * @return List of attractions that are suitable for child
     */
    public List<Attraction> getAllChildAttractions() {
        List<Attraction> childAttractions = new ArrayList<>();
        for (Attraction attraction : getAllAttractions()) {
            if (attraction.getMinAge() == null || attraction.getMinAge() < ADULT_AGE) {
                childAttractions.add(attraction);
            }
        }
        return childAttractions;
    }

    public Attraction getBackerJumbo() {
        return backerJumbo;
    }

    public Attraction getFrontEnderer() {
        return frontEnderer;
    }

    public Attraction getKobolter() {
        return kobolter;
    }
}
