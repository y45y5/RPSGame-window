import javax.swing.*;
import java.util.Random;

public class Game {

    int winningStreak = 0;

    public void humanMove(Option humanOption, JTextArea textArea){
        Option computer = computerMove();
        String status;

        if(computer.equals(humanOption)) status = "Tie!";
        else if(checkWinner(computer, humanOption)) { status = "You win!"; winningStreak++; }
        else { status = "You lose!"; winningStreak = 0; }

        textArea.setText(status + "\n" + "Computer picked " + computer + "\nCurrent winning streak: " + winningStreak);
    }

    private Option computerMove(){
        return Option.values()[new Random().nextInt(3)];
    }

    private boolean checkWinner(Option computerOption, Option humanOption){
        switch(humanOption){
            case PAPER:
                return computerOption.equals(Option.ROCK);
            case ROCK:
                return computerOption.equals(Option.SCISSORS);
            case SCISSORS:
                return computerOption.equals(Option.PAPER);
            default:
                return false;
        }
    }
}
