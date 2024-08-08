package Chapter1;/* % java IfTest2
xisNOT3
This runs no matter what */

public class IfTest2 {
    public static void main(String[] args) {
        int x = 2;

        if(x==3)
        {
            System.out.print("x must be 3");
        }
        else
        {
            System.out.println("x is NOT 3");
        }
        System.out.println("This runs no matter what");
    }
}