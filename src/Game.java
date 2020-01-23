import java.util.Random;

public class Game {

    public void humanMove(Option humanOption, MainCanvas mainCanvas){
        Option computer = computerMove();
        String status;
        if(computer.equals(humanOption)) status = "Tie!";
        else if(checkWinner(computer, humanOption)) status = "You win!";
        else status = "You lose!";
        mainCanvas.setString(status, "Computer picked " + computer);
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
