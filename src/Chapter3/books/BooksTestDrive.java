package Chapter3.books;

public class BooksTestDrive{
    public static void main(String[] args){

        Books[] myBooks = new Books[3];
        int x = 0;

        // Initializing each element with a new Books object else u will get "nullpointerexception"
        for (int i = 0; i < myBooks.length; i++) {
            myBooks[i] = new Books();
        }


        myBooks[0].title = "The grapes of java";
        myBooks[1].title = "harry potter";
        myBooks[2].title = "The java gatsby";

        myBooks[0].author = "bob";
        myBooks[1].author = "sue";
        myBooks[2].author = "ian";

        while(x<3)
        {
            System.out.print(myBooks[x].title);
            System.out.print(" by ");
            System.out.println(myBooks[x].author);

            x = x+1;
        }

    }
}