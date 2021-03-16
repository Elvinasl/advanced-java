package duck_game.model.player;

import java.util.Comparator;

/**
 * Sorts player by points descending. More points on the top, less on the bottom
 */
public class PlayerPointsComparator implements Comparator<Player> {
    @Override
    public int compare(Player o1, Player o2) {
        return o2.getPoints() - o1.getPoints();
    }
}
