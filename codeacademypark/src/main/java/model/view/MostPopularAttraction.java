package model.view;

/**
 * View to represent most popular attraction
 */
public class MostPopularAttraction {
    private String name;
    private int visits;

    public MostPopularAttraction(String name, int visits) {
        this.name = name;
        this.visits = visits;
    }

    public String getName() {
        return name;
    }

    public int getVisits() {
        return visits;
    }

    @Override
    public String toString() {
        return "Most popular attraction: " + name + " visits: " + visits;
    }
}
