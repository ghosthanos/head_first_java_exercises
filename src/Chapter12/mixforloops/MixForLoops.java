package Chapter12.mixforloops;

import java.util.List;

public class MixForLoops{
    public static void main(String[] args) {

        List<Integer> nums = List.of(1, 2, 3, 4, 5);
        String output = "";

        for (int i = 0; i < nums.size(); i++) {
            output += nums.get(i) + " ";
        }

        // candidates:     Possible outputs
        //  1               c
        //  2               e
        //  3               b
        //  4               d

        System.out.println(output);
    }
}
