import model.attraction.Attraction;
import model.visitor.Adult;
import model.visitor.Child;
import model.visitor.Visitor;
import service.AttractionPark;
import service.AttractionService;

import java.util.List;

public class AttractionParkMain {
    public static void main(String[] args) {

        AttractionPark attractionPark = new AttractionPark();
        AttractionService attractionService = new AttractionService();

        Attraction frontEnderer = attractionService.getFrontEnderer();
        Attraction backerJumbo = attractionService.getBackerJumbo();
        Attraction kobolter = attractionService.getKobolter();

        // visitors
        Visitor adult = new Adult(19, List.of(frontEnderer));
        Visitor adult1 = new Adult(22, List.of(backerJumbo, frontEnderer, kobolter));
        Visitor adult2 = new Adult(26, attractionService.getAllAttractions());
        Visitor child = new Child(9, attractionService.getAllChildAttractions());

        // tickets
        attractionPark.sellTicket(adult);
        attractionPark.sellTicket(adult1);
        attractionPark.sellTicket(adult2);
        attractionPark.sellTicket(child);

        System.out.println("------------------------");
        System.out.println("Most popular attractions: " + attractionPark.getMostPopularAttraction());
        System.out.println("Total visitors: " + attractionPark.getTotalVisitorsCount());
        System.out.println("Average price per ticket: " + attractionPark.getAverageTicketPrice());
        System.out.println("Total ravenue: " + attractionPark.getTotalRevenue());
        System.out.println("------------------------");

    }
}
