package duck_game.service;

import duck_game.model.duck.Duck;

import java.util.Random;

public class DuckGeneratorService {

    private Random rd = new Random();

    public Duck[] generateDucks(int amount) {
        Duck[] ducks = new Duck[amount];

        for (int i = 0; i <= amount - 1; i++) {
            Duck d = new Duck(isGolden(), generatePoints());
            ducks[i] = d;
        }
        return ducks;
    }

    private int generatePoints() {
        return (rd.nextInt(4)+1) * 10;
    }

    private boolean isGolden() {
        return  (rd.nextInt(50)+1) == 50;
    }
}
