package duck_game.service;

import duck_game.model.player.Player;
import duck_game.model.prize.BigToy;
import duck_game.model.prize.MediumToy;
import duck_game.model.prize.Prize;
import duck_game.model.prize.SmallToy;

import java.math.BigDecimal;

/**
 * Service which is responsible for prize calculations
 */
public class PrizeCalculatorService {

    private static final int NUM_POINTS_SMALL_PRIZE = 80;
    private static final int NUM_POINTS_BIG_PRIZE = 140;

    /**
     * - up to 80 points – small toy
     * 80 – 140 – medium toy
     * 140+ – big toy
     * @param totalPoints got by the player
     * @return prize that is won
     */
    public Prize determinePrize(int totalPoints) {
        if (totalPoints >= NUM_POINTS_BIG_PRIZE) {
            return new BigToy();
        }

        if (totalPoints >= NUM_POINTS_SMALL_PRIZE) {
            return new MediumToy();
        }
        return new SmallToy();
    }

    /**
     * Determines the total amount that was won by the player.
     * If playwer participated in competition and won, we add total amount of extra prize
     * @param player player that was playing
     * @return amount that player has won
     */
    public BigDecimal getTotalAmountWon(Player player){
        BigDecimal amount = player.getPrize().getPrice();
        if (player.getExtraPrize() != null){
            amount = amount.add(player.getExtraPrize().getPrice());
        }
        return amount;
    }
}
