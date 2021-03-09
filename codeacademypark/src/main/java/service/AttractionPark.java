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

/**
 * A class to represent an attraction park
 */
public class AttractionPark {

    private List<Ticket> tickets = new ArrayList<>();
    private PriceService priceService = new PriceService();

    /**
     * Sells a ticket to a visitor
     * @param visitor which is about to buy a ticket
     */
    public void sellTicket(Visitor visitor) {
        tickets.add(new Ticket(visitor));
    }

    /**
     * @return Total count of all attraction park visitors
     */
    public int getTotalVisitorsCount() {
        return tickets.size();
    }

    /**
     * Calculates the most popular attraction. If there are no attractions attended it throws a runtime exception.
     * @return Most popular attraction from the attraction park
     */
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

    /**
     * Callculates average ticket price
     * @return average ticket price
     */
    public BigDecimal getAverageTicketPrice() {
        return priceService.getAverageTicketPrice(tickets);
    }

    /**
     * @return total price of all tickets
     */
    public BigDecimal getTotalRevenue() {
        return priceService.getTotalRevenue(tickets);
    }

    /**
     * Prepares a map with attractions
     * @return Map of attraction name and number of visits
     */
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
