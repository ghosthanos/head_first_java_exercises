package Chapter4.poordog;

public class PoorDog{

    //if variable not assigned they return their default values
    //int is 0, float is 0.0, booleans is false, references is null
    // applicable only for instance variables and not for local variable

    private int size;
    private String name;

    public int getSize() {
        return size;
    }
    public String getName() {
        return name;
    }
}

