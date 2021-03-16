import duck_game.Competition;
import duck_game.model.player.Player;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Player player1 = new Player("Elvis");
//        player1.playGame();
//        System.out.println("Points: " + player1.getPoints());
//        System.out.println("Prize: " + player1.getPrize());

        Player player1 = new Player("Elvis");
        player1.playGame();

        Player player2 = new Player("Tomas");
        player2.playGame();

        Player player3 = new Player("Dimitrij");
        player3.playGame();

        Player player4 = new Player("Giedrius");
        player4.playGame();

        Player player5 = new Player("Simonas");
        player5.playGame();

        Competition competition = new Competition();
        Player competitionWinner = competition.getExtraPriceWinner(List.of(player1, player2, player3, player4, player5));

        System.out.println("Extra prize winner: " + competition);
        System.out.println("Winner total amount: " + competitionWinner.getTotalAmountWon());
    }
}
