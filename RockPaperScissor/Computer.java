package RockPaperScissor;

import java.util.Random;

public class Computer {
    String[] choices = {"rock", "paper", "scissors"};
    Random r = new Random();

    String getChoice() {
        return choices[r.nextInt(choices.length)];
    }
}
