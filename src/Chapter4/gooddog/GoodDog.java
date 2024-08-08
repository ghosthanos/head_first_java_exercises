package Chapter4.gooddog;

public class GoodDog{

    //KEEP INSTANCES PRIVATE AND GETTERS,SETTERS PUBLIC

    private int size;

    public int getSize(){
        return size;
    }
    public void setSize(int size){
        this.size = size;
    }

    void bark(){
        if(size > 60){
            System.out.println("Woof! Woof!");
        }
        else if(size > 14){
            System.out.println("Ruff! Ruff!");
        }
        else{
            System.out.println("Yip! Yip!");
        }
    }
    }
