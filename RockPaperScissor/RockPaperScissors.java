package RockPaperScissor;

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        String[] choices = {"rock", "paper", "scissors"};

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        System.out.println("Choose rock, paper or scissors: ");
        String player = sc.nextLine().trim().toLowerCase();

        String computer = choices[r.nextInt(choices.length)];

        System.out.println("Computer chose :" + computer);

        if(player.equals(computer)) {
            System.out.println("It's a tie ! Both chose " + player + ".");
        } else if ((player.equals("rock") && computer.equals("scissors")) ||
                   (player.equals("paper") && computer.equals("rock")) ||
                   (player.equals("scissors") && computer.equals("paper"))) {
            System.out.println("You Win! " + player + " beats " + computer + ".");
        } else {
            System.out.println("Computer win " + computer + " beats " + player + ".");
        }
        sc.close();
    }
}
