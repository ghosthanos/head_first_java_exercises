package Chapter9.hippo;

public class TestHippo{
    public static void main(String []args){
        System.out.println("Starting...");

        //working: onto the stack -> Hippo() -> Animal() -> Object()
        //then executing order -> "Starting..." -> Animal() -> Hippo()

        Hippo h = new Hippo();
    }
}