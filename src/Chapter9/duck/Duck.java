package Chapter9.duck;

public  class Duck{
    int size;

    //int parameter to Duck constructor
    //NOTE: the constructor name should be same as that of the class name

    public Duck(int duckSize){
        System.out.println("Quack");
        size = duckSize;

        System.out.println("size is: " + size);
    }
}