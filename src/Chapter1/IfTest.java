package Chapter1;/* % java IfTest
x must be 3
This runs no matter what */

public class IfTest {
    public static void main(String[] args) {
       int x = 3;

       if(x==3)
       {
           System.out.print("x must be 3");
       }
       else{
           System.out.print("This runs no matter what");
       }
    }
}