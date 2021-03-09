package service;

import model.ticket.Ticket;
import model.visitor.Visitor;

import java.math.BigDecimal;
import java.util.List;

import static util.Constants.*;

/**
 * A Service that is responsible to for price calculations
 */
public class PriceService {

    public BigDecimal getTotalPrice(Visitor visitor) {
        return getVisitorPrice(visitor).multiply(BigDecimal.valueOf(visitor.getAttractions().size()));
    }

    /**
     * Calculates the revenue of all sold tickets
     */
    public BigDecimal getTotalRevenue(List<Ticket> soldTickets) {
        BigDecimal total = BigDecimal.ZERO;
        for (Ticket ticket : soldTickets) {
            total = total.add(ticket.getPrice());
        }
        return total;
    }

    public BigDecimal getAverageTicketPrice(List<Ticket> soldTickets) {
        return getTotalRevenue(soldTickets).divide(BigDecimal.valueOf(soldTickets.size()));
    }

    private BigDecimal getVisitorPrice(Visitor visitor) {
        if (visitor.getAge() < ADULT_AGE) {
            return BigDecimal.valueOf(CHILD_PRICE);
        }
        return BigDecimal.valueOf(ADULT_PRICE);
    }
}
