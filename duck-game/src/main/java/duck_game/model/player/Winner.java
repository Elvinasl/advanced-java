package duck_game.model.player;

import duck_game.model.prize.Prize;

/**
 * Indicates that the object will have a price
 */
public interface Winner {
    Prize getPrize();
    Prize getExtraPrize();
}
