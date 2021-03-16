package duck_game.model.prize;

import java.math.BigDecimal;

public class ExtraPrize extends Prize {
    private static final String NAME = "Extra price";
    private static final BigDecimal PRICE = BigDecimal.valueOf(10);

    public ExtraPrize() {
        super(NAME, PRICE);
    }
}
