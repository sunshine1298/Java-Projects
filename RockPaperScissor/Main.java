package RockPaperScissor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose rock, paper or scissors: ");
        String input = sc.nextLine().trim().toLowerCase();

        Player player = new Player(input);

        Computer computer = new Computer();

        String computerChoice = computer.getChoice();
        System.out.println("Computer chose: " + computerChoice);

        Game game = new Game();

        String winner = game.getWinner(player.getChoice(), computerChoice);
        System.out.println("Winner: " + winner);

    sc.close();
    }
}
