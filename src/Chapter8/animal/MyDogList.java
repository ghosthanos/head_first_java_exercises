package Chapter8.animal;

import Chapter2.dogtestdrive.Dog;

public class MyDogList {

    private Dog[] dogs = new Dog[5];
    private int nextIndex = 0;

    public void addDogs(Dog d) {
        if (nextIndex < dogs.length) {
            dogs[nextIndex] = d;
            System.out.println("Dog added at index: " + nextIndex);
            nextIndex++;
        }
    }
}
