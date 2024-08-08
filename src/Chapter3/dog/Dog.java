package Chapter3.dog;

public class Dog {
    String name;
    void bark(){
        System.out.println(name + " says Ruff!");
    }
    void eat(){

    }
    void chaseCat(){

    }

    public static void main(String[] args) {

        //making a Dog object
        Dog d = new Dog();
        d.bark();
        d.name = "Bart";

        //Dog array
        Dog[] dogarr = new Dog[3];
        //assigning some dogs
        dogarr[0] = new Dog();
        dogarr[1] = new Dog();
        dogarr[2] = new Dog();

        //accessing them using array index
        dogarr[0].name = "Fred";
        dogarr[1].name = "Marge";

        //since we didnt assign name to dog at index 2 it is displayed as "null"
        System.out.println(dogarr[2].name);

        //looping through the array and telling the dogs to bark
        for(int i=0;i<dogarr.length;i++){
            dogarr[i].bark();
        }
    }
}