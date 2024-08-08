package Chapter1;

//the code will compile

public class Exercise1b {
    public static void main(String[] args) {
        int x = 5;
        while (x > 1) {
            x = x-1;
            if(x < 3) {
                System.out.println("small x");
            }
        }
    }
}
