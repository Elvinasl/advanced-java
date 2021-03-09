package model.ticket;

import model.attraction.Attraction;
import model.visitor.Visitor;
import service.PriceService;

import java.math.BigDecimal;
import java.util.List;

public class Ticket implements Priceble {

    private Visitor visitor;
    private PriceService priceService;

    public Ticket(Visitor visitor) {
        this.visitor = visitor;
        this.priceService = new PriceService();
    }

    @Override
    public BigDecimal getPrice() {
        return priceService.getTotalPrice(visitor);
    }

    public List<Attraction> getVisitorAttractions() {
        return visitor.getAttractions();
    }
}
