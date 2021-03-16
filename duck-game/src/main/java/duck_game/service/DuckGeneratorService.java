package duck_game.service;

import duck_game.model.duck.Duck;

import java.util.Random;

/**
 * Service which is reponsible for duck generation
 */
public class DuckGeneratorService {

    private Random rd = new Random();

    /**
     * Generates an array of random ducks
     * @param amount amount of ducks to be generated
     * @return generated ducks
     */
    public Duck[] generateDucks(int amount) {
        Duck[] ducks = new Duck[amount];

        for (int i = 0; i <= amount - 1; i++) {
            Duck d = new Duck(isGolden(), generatePoints());
            ducks[i] = d;
        }
        return ducks;
    }

    /**
     * generates duck points
     * @return 10,20,30 or 40 points
     */
    private int generatePoints() {
        return (rd.nextInt(4)+1) * 10;
    }

    /**
     * Chance for the duck to be golden is 1 out of 50
     * @return if the duck is dolden or not
     */
    private boolean isGolden() {
        return  (rd.nextInt(50)+1) == 50;
    }
}
