package duck_game.service;

import duck_game.model.prize.BigToy;
import duck_game.model.prize.MediumToy;
import duck_game.model.prize.Prize;
import duck_game.model.prize.SmallToy;

public class PrizeCalculatorService {

    private static final int NUM_POINTS_SMALL_PRIZE = 80;
    private static final int NUM_POINTS_BIG_PRIZE = 140;

    public Prize determinePrize(int totalPoints) {
        if (totalPoints >= NUM_POINTS_BIG_PRIZE) {
            return new BigToy();
        }

        if (totalPoints >= NUM_POINTS_SMALL_PRIZE) {
            return new MediumToy();
        }
        return new SmallToy();
    }
}
