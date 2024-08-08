package Chapter8.poolpuzzle;

public class Of76 extends Clowns {
    public static void main(String[] args) {

        Nose[] i = new Nose[3];
        i[0] = new Acts();
        i[1] = new Clowns();
        i[2] = new Of76();

        for (int x = 0; x < 3; x++) {
            //System.out.println(i[x].getClass());

            //getClass() method returns the runtime class of the object, which includes the package name and the class name.
            //we only need the class name so we use .getSimpleName() along with getClass()
            System.out.println(i[x].iMethod() + " " + "class " + i[x].getClass().getSimpleName());
        }
    }
}
