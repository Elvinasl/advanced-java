package duck_game.exception;

public class NoDucksCaughtException extends RuntimeException {
    public NoDucksCaughtException() {
        super("You need to catch more ducks!");
    }
}
