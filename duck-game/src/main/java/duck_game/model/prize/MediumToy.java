package duck_game.model.prize;

import java.math.BigDecimal;

public class MediumToy extends Prize {
    private static final String NAME = "Medium Teddy";
    private static final BigDecimal PRICE = BigDecimal.valueOf(20);

    public MediumToy() {
        super(NAME, PRICE);
    }
}
