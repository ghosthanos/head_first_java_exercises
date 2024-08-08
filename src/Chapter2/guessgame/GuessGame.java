package Chapter2.guessgame;

public class GuessGame {
Player p1;
Player p2;
Player p3;

public void startGame(){
    //created three Player objects
    p1 = new Player();
    p2 = new Player();
    p3 = new Player();

    //3 variables to hold the guesses of the 3 players
    int guess1 = 0;
    int guess2 = 0;
    int guess3 = 0;

    //3 variables to hold the true or false based on their guess
    boolean p1isRight = false;
    boolean p2isRight = false;
    boolean p3isRight = false;

    boolean GameOver = false;
    //target number that the player has to guess
    int target = (int) (Math.random() * 10);
    System.out.println("Im thinking of a number between 0 to 9");

    while(!GameOver)
    {
        //calling each player's guess method
        p1.guess();
        p2.guess();
        p3.guess();

        //displaying what players guessed
        System.out.println("Player1 guessed: " + p1.guessednumber);
        System.out.println("Player2 guessed: " + p2.guessednumber);
        System.out.println("Player3 guessed: " + p3.guessednumber);

        //if guessed right we change state to true
        if (p1.guessednumber == target){
            p1isRight = true;
        }
        if (p2.guessednumber == target){
            p2isRight = true;
        }
        if (p3.guessednumber == target){
            p3isRight = true;
        }

        //checking if they guessed right or not

        if(p1isRight || p2isRight || p3isRight)
        {
            System.out.println("We have a winner");
            System.out.println("Player 1 got it right? " + p1isRight);
            System.out.println("Player 2 got it right? " + p2isRight);
            System.out.println("Player 3 got it right? " + p3isRight);

            GameOver = true;
        }
        else{
            System.out.println("Players will have to try again");
        }
    }
}
}