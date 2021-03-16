package duck_game.model.prize;

import java.math.BigDecimal;

public class BigToy extends Prize {

    private static final String NAME = "Big teddy";
    private static final BigDecimal PRICE = BigDecimal.valueOf(30);

    public BigToy() {
        super(NAME, PRICE);
    }
}
