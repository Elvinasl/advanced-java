package duck_game.model.prize;

import java.math.BigDecimal;

/**
 * Indicates that the object has a price
 */
public interface Valuable {
    BigDecimal getPrice();
}
