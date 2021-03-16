package duck_game.model.prize;

import java.math.BigDecimal;

public class SmallToy extends Prize {
    private static final String NAME = "Small Teddy Bear";
    private static final BigDecimal PRICE = BigDecimal.valueOf(10);

    public SmallToy() {
        super(NAME, PRICE);
    }
}
