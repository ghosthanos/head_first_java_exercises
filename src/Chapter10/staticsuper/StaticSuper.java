package Chapter10.staticsuper;

public class StaticSuper{
    static {
        System.out.println("super static block");
    }

    StaticSuper(){
        System.out.println("super constructor");
    }
}
