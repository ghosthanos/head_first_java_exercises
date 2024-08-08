package Chapter4.dog;

/*op:
* Woof! Woof!
* Ruff! Ruff!
* Yip! Yip!*/


class Dog {
    int size;
    String name;

//    void bark(int) {
//        if (size > 60) {
//            System.out.println("Woof! Woof!");
//        }
//        else if (size > 14) {
//            System.out.println("Ruff! Ruff!");
//        }
//        else {
//            System.out.println("Yip! Yip!");
//        }
//    }

    void bark(int numOfBarks){
        while(numOfBarks > 0){
            System.out.println("Ruff! Ruff!");
            numOfBarks = numOfBarks - 1;
        }
    }
}
