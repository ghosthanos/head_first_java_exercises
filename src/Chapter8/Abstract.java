package Chapter8;

//about abstract classes and methods

abstract class Animal{
    public abstract void sound();
}

class Dog extends Animal{
    public void sound(){
        System.out.println("Bark");
    }
}

class Cat extends Animal{
    public void sound(){
        System.out.println("Meow");
    }
}



public class Abstract{
    public static void main(String []args){
        Dog d = new Dog();
        Cat c = new Cat();
        d.sound();
        c.sound();

    }
}