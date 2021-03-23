package lt.codeacademy.stream_api.basic.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Random;

public class Dish {

    private Long id;

    private String name;

    private BigDecimal price;

    private LocalDateTime lastPrepared = LocalDateTime.now();

    private boolean isPopular;

    public Dish(Long id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = BigDecimal.valueOf(price);
        this.isPopular = new Random().nextBoolean();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
