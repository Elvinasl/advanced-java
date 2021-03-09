package service;

import model.attraction.BackerJumbo;
import model.attraction.FrontEnderer;
import model.ticket.Ticket;
import model.visitor.Adult;
import model.visitor.Child;
import model.visitor.Visitor;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static util.Constants.ADULT_AGE;

class PriceServiceTest {

    private PriceService priceService = new PriceService();

    @Test
    void getTotalPrice_adult() {
        // prepare
        Visitor adult = new Adult(ADULT_AGE, List.of(new BackerJumbo(), new FrontEnderer()));

        // act
        BigDecimal result = priceService.getTotalPrice(adult);

        // assert
        assertEquals(BigDecimal.valueOf(30), result);
    }

    @Test
    void getTotalPrice_child() {
        // prepare
        Visitor adult = new Child(17, List.of(new BackerJumbo(), new FrontEnderer()));

        // act
        BigDecimal result = priceService.getTotalPrice(adult);

        // assert
        assertEquals(BigDecimal.valueOf(20), result);
    }

    @Test
    void getTotalRavenue() {
        // prepare
        List<Ticket> tickets = List.of(new TestTicketImpl(10), new TestTicketImpl(10));

        // act
        BigDecimal revenue = priceService.getTotalRevenue(tickets);

        // assert
        assertEquals(BigDecimal.valueOf(20), revenue);
    }

    @Test
    void getAverageTicketPrice() {
        // prepare
        List<Ticket> tickets = List.of(new TestTicketImpl(10), new TestTicketImpl(20));

        // act
        BigDecimal revenue = priceService.getAverageTicketPrice(tickets);

        // assert
        assertEquals(BigDecimal.valueOf(15), revenue);
    }

    private static class TestTicketImpl extends Ticket {

        private BigDecimal price;

        public TestTicketImpl(int price) {
            super(null);
            this.price = BigDecimal.valueOf(price);
        }

        @Override
        public BigDecimal getPrice() {
            return price;
        }
    }
}