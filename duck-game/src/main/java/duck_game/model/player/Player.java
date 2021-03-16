package duck_game.model.player;

import duck_game.exception.NoDucksCaughtException;
import duck_game.model.Namable;
import duck_game.model.duck.Duck;
import duck_game.model.duck.Pointable;
import duck_game.model.prize.Prize;
import duck_game.service.DuckGeneratorService;
import duck_game.service.PrizeCalculatorService;

import java.math.BigDecimal;

/**
 * Player representation in the game
 */
public class Player implements Pointable, Winner, Namable {

    private static final int AMOUNT_OF_DUCKS = 4;
    private static final int EXTRA_POINTS_FOR_GOLDEN = 50;

    private DuckGeneratorService duckGeneratorService = new DuckGeneratorService();
    private PrizeCalculatorService prizeCalculatorService = new PrizeCalculatorService();
    private Duck[] ducks;
    private final String name;
    private Prize extraPrize = null;

    public Player(String name) {
        this.name = name;
    }

    /**
     * Play a game with the amount of ducks declared
     */
    public void playGame() {
        this.ducks = duckGeneratorService.generateDucks(AMOUNT_OF_DUCKS);
    }

    public void setExtraPrize(Prize extraPrize) {
        this.extraPrize = extraPrize;
    }

    public BigDecimal getTotalAmountWon() {
        return prizeCalculatorService.getTotalAmountWon(this);
    }

    /**
     * Calculates total points of the player. If the player caught golden duck, we add extra points
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

    /**
     * @return the price that is won by the player
     */
    @Override
    public Prize getPrize() {
        return prizeCalculatorService.determinePrize(getPoints());
    }

    @Override
    public Prize getExtraPrize() {
        return extraPrize;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Player: " + getName();
    }


    /**
     * @return ducks that are caught by the player
     */
    private Duck[] getDucks() {
        if (ducks == null) {
            throw new NoDucksCaughtException();
        }
        return ducks;
    }
}
