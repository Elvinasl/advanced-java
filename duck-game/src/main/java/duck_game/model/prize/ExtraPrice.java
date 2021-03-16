package duck_game.model.prize;

import java.math.BigDecimal;

public class ExtraPrice extends Prize {
    private static final String NAME = "Extra price";
    private static final BigDecimal PRICE = BigDecimal.valueOf(10);

    public ExtraPrice() {
        super(NAME, PRICE);
    }
}
