package duck_game.model.prize;

import duck_game.model.Namable;

import java.math.BigDecimal;

/**
 * Abstraction of a price
 */
public abstract class Prize implements Namable, Valuable {

    private String name;

    private BigDecimal price;

    public Prize(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public BigDecimal getPrice() {
        return price;
    }
}
