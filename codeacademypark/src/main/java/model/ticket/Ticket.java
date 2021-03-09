package model.ticket;

import model.attraction.Attraction;
import model.visitor.Visitor;
import service.PriceService;

import java.math.BigDecimal;
import java.util.List;

/**
 * Ticket representation
 */
public class Ticket implements Priceble {

    private Visitor visitor;
    private PriceService priceService;

    public Ticket(Visitor visitor) {
        this.visitor = visitor;
        this.priceService = new PriceService();
    }

    /**
     * Total prive of the ticket
     */
    @Override
    public BigDecimal getPrice() {
        return priceService.getTotalPrice(visitor);
    }

    /**
     * Gets the attractions that the visitor is about to visit
     */
    public List<Attraction> getVisitorAttractions() {
        return visitor.getAttractions();
    }
}
