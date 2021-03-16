package duck_game.exception;

public class CompetingPlayersSizeException extends RuntimeException {
    public CompetingPlayersSizeException(int maxCompetingPlayers) {
        super("Number of players required to compete for extra price is: " + maxCompetingPlayers);
    }
}
