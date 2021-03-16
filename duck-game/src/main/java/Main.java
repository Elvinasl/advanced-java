import duck_game.model.Player;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Elvis");
        player1.playGame();
        System.out.println("Points: " + player1.getPoints());
        System.out.println("Prize: " + player1.getPrize());
    }
}
