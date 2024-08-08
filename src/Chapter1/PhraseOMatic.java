package Chapter1;

import java.util.Random;

public class PhraseOMatic {
    public static void main(String[] args) {
        String[] wordListOne = {"24/7", "multiTier", "30,OOO foot", "B-to-B", "win-win", "frontend", "web-based",
                "pervasive", "smart", "six-sigma", "critical-path", "dynamic"};

        String[] wordListTwo = {"empowered", "sticky", "value-added.", "oriented", "centric", "distributed",
                "clustered", "branded", "outside-the-box", "positioned", "networked", "focused",
                "leveraged", "aligned", "targeted", "shared", "cooperative", "accelerated"};

        String[] wordListThree = {"process", "tipping-point", "solution", "architecture", "core competency", "strategy",
                "mindshare", "portal", "space", "vision", "paradigm", "mission"};

        //finding length of the array of strings using "length" : len = array_name.length

        int l1 = wordListOne.length;
        int l2 = wordListTwo.length;
        int l3 = wordListThree.length;

        //random function steps:
        //1) Random random = new Random();
        //2) datatype variable_name = random.nextdatatype();      example : int random1 = random.nextInt(5);

        Random random = new Random();

        int r1 = random.nextInt(l1);
        int r2 = random.nextInt(l2);
        int r3 = random.nextInt(l3);

        String phrase = wordListOne[r1] + " " + wordListTwo[r2] + " " + wordListThree[r3];

        System.out.println(phrase);
    }
}
