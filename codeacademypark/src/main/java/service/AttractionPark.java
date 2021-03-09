package service;

import exception.NoAttractionsAttendedException;
import model.attraction.Attraction;
import model.ticket.Ticket;
import model.view.MostPopularAttraction;
import model.visitor.Visitor;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AttractionPark {

    private List<Ticket> tickets = new ArrayList<>();
    private PriceService priceService = new PriceService();

    public void sellTicket(Visitor visitor) {
        tickets.add(new Ticket(visitor));
    }

    public int getTotalVisitorsCount() {
        return tickets.size();
    }

    public MostPopularAttraction getMostPopularAttraction() {
        Map<String, Integer> attractionStats = getAttractionStats();

        if (attractionStats.keySet().size() == 0) {
            throw new NoAttractionsAttendedException();
        }

        String biggestCountKey = (String) attractionStats.keySet().toArray()[0]; // initial
        for(String attractionName : attractionStats.keySet()) {
            if(attractionStats.get(biggestCountKey) <= attractionStats.get(attractionName)) {
                biggestCountKey = attractionName;
            }
        }

        return new MostPopularAttraction(biggestCountKey, attractionStats.get(biggestCountKey));
    }

    public BigDecimal getAvaregeTicketPrice() {
        return priceService.getAverageTicketPrice(tickets);
    }

    public BigDecimal getTotalRavenue() {
        return priceService.getTotalRevenue(tickets);
    }

    private Map<String, Integer> getAttractionStats() {
        // map which contains attraction name and total visits
        Map<String, Integer> attractionStats = new HashMap<>();
        for (Ticket ticket : tickets) {
            for (Attraction attraction : ticket.getVisitorAttractions()) {
                String name = attraction.getName();
                if (attractionStats.containsKey(name)) {
                    // we have count already
                    int currentAttractionCount = attractionStats.get(name);
                    attractionStats.put(name, currentAttractionCount + 1);
                } else {
                    attractionStats.put(name, 1);
                }
            }
        }
        return attractionStats;
    }
}
