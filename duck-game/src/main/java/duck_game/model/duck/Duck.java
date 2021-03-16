package duck_game.model.duck;

public class Duck implements Goldable, Pointable {

    private boolean isGolden;

    private int points;

    public Duck(boolean isGolden, int points) {
        this.isGolden = isGolden;
        this.points = points;
    }

    @Override
    public int getPoints() {
        return points;
    }

    @Override
    public boolean isGolden() {
        return isGolden;
    }
}
