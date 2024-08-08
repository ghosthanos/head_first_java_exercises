package Chapter2.guessgame;

public class Player {
int guessednumber = 0;

//guess method for the player
    public void guess(){
        guessednumber = (int) (Math.random() * 10);
        System.out.println("the player guessed: " + guessednumber);
    }
}