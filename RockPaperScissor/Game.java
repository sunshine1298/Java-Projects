package RockPaperScissor;

public class Game {

    String getWinner(String player, String computer) {

        if(player.equals(computer)) {
            return "TIE";
        }

        if((player.equals("rock") && computer.equals("scissors")) ||
           (player.equals("paper") && computer.equals("rock")) ||
           (player.equals("scissors") && computer.equals("paper"))) {
            
           return "PLAYER";
           }

        return "COMPUTER";
    }
    
}
