package duck_game;

import duck_game.exception.CompetingPlayersSizeException;
import duck_game.model.player.Player;
import duck_game.model.player.PlayerPointsComparator;
import duck_game.model.prize.ExtraPrize;

import java.util.ArrayList;
import java.util.List;

public class Competition {

    private static final int MAX_COMPETING_PLAYERS = 5;

    public Competition() {
    }

    public Player getExtraPriceWinner(List<Player> competingPlayers) {
        if (competingPlayers.size() != MAX_COMPETING_PLAYERS) {
            throw new CompetingPlayersSizeException(MAX_COMPETING_PLAYERS);
        }
        List<Player> playersToSort = new ArrayList<>(competingPlayers);
        playersToSort.sort(new PlayerPointsComparator());
        Player winner =  playersToSort.get(0);
        winner.setExtraPrize(new ExtraPrize());
        return winner;
    }
}
