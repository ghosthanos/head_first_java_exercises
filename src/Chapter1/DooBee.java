package Chapter1;

import java.util.Random;

public class DooBee {
    public static void main(String[] args) {
        String[] wordListOne = {"24/7", "multiTier", "30,OOO foot", "B-to-B", "win-win", "frontend", "web-based",
                "pervasive", "smart", "six-sigma", "critical-path", "dynamic"};

        String[] wordListTwo = {"empowered", "sticky", "value-added.", "oriented", "centric", "distributed",
                "clustered", "branded", "outside-the-box", "positioned", "networked", "focused",
                "leveraged", "aligned", "targeted", "shared", "cooperative", "accelerated"};

        String[] wordListThree = {"process", "tipping-point", "solution", "architecture", "core competency", "strategy",
                "mindshare", "portal", "space", "vision", "paradigm", "mission"};

        //numbers of items in a array of strings
        // we use listname.length
        int length1 = wordListOne.length;
        int length2 = wordListTwo.length;
        int length3 = wordListThree.length;

        //generating random numbers
        // we use Random random = new Random();
        // then we use Datatype variable_name = random.nextDatatype();

        Random random = new Random();
        int r1 = random.nextInt(length1);
        int r2 = random.nextInt(length2);
        int r3 = random.nextInt(length3);

        //generating random phrases with random values of 3 lists

        String phrase = wordListOne[r1] + " " + wordListTwo[r2] + " " + wordListThree[r3];
        System.out.println(phrase);

    }
}