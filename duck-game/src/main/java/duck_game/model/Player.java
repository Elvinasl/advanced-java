package duck_game.model;

import duck_game.exception.NoDucksCaughtException;
import duck_game.model.duck.Duck;
import duck_game.model.duck.Pointable;
import duck_game.model.prize.Prize;
import duck_game.service.DuckGeneratorService;
import duck_game.service.PrizeCalculatorService;

public class Player implements Pointable, Winner, Namable {

    private static final int AMOUNT_OF_DUCKS = 4;
    private static final int EXTRA_POINTS_FOR_GOLDEN = 4;

    private DuckGeneratorService duckGeneratorService = new DuckGeneratorService();
    private PrizeCalculatorService prizeCalculatorService = new PrizeCalculatorService();
    private Duck[] ducks;
    private final String name;

    public Player(String name) {
        this.name = name;
    }

    public void playGame() {
        this.ducks = duckGeneratorService.generateDucks(AMOUNT_OF_DUCKS);
    }

    /**
     * Calculates total points of the player
     */
    @Override
    public int getPoints() {
        int totalPoints = 0;

        for(Duck duck : getDucks()) {
            totalPoints += duck.getPoints();

            if (duck.isGolden()) {
                totalPoints += EXTRA_POINTS_FOR_GOLDEN;
                System.out.println("YOU GOT A GOLDEN DUCK!");
            }
        }
        return totalPoints;
    }

    @Override
    public Prize getPrize() {
        return prizeCalculatorService.determinePrize(getPoints());
    }

    @Override
    public String getName() {
        return name;
    }

    private Duck[] getDucks() {
        if (ducks == null) {
            throw new NoDucksCaughtException();
        }
        return ducks;
    }
}
