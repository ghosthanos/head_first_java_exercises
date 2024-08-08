package Chapter6.egg;

import java.util.ArrayList;

public class Egg {
    public static void main(String[] args) {

        //making an array list
        ArrayList<Egg> myList = new ArrayList<Egg>();

        Egg e1 = new Egg();
        Egg e2 = new Egg();

        /*if instead of <Egg> if it were <String>
        ArrayList<Egg> myList = new ArrayList<Egg>();

        myList().add("e1");
        myList().add("e2");*/

        //adding to list
        myList.add(e1);
        myList.add(e2);

        //size of list
        int size = myList.size();
        System.out.println("The size of myList is: " + size);

        //check if it contains egg e1
        boolean checke1 = myList.contains(e1);
        System.out.println(checke1);

        //check index of e2
        int indexe2 = myList.indexOf(e2);
        System.out.println(indexe2);

        //check if list is empty
        boolean empty = myList.isEmpty();
        System.out.println(empty);

        //remove e1
        myList.remove(e1);
        System.out.println(myList);
    }
}
