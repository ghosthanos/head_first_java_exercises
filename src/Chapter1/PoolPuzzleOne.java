package Chapter1;

/*output:
a noise
annoys
an oyster*/

public class PoolPuzzleOne {
    public static void main(String[] args) {
        int x = 0;
        while (x < 4) {
            if (x < 1) {
                System.out.print("a ");
            }

            if ((x > 0) && (x < 2)) {
                System.out.println("noise ");
            }

            if ((x > 1) && (x < 3)) {
                System.out.println("annoys ");
            }

            if (x > 2) {
                System.out.println("an oyster");
            }

            x = x+1;
        }
    }
}