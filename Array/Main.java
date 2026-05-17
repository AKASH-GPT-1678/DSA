package Array;
import java.util.*;
public class Main {

    public static void main(String[] args)
    {



        String vals = "abcabcbb";
        Substring substring = new Substring();
        int length = substring.lengthOfLongestSubstring(vals);
        System.out.println(length);
        String[] tests = {
                "abcabcbb", // 3
                "bbbbb",    // 1
                "pwwkew",   // 3
                "dvdf",     // 3
                "abba",     // 2
                "tmmzuxt",  // 5
                "anviaj",   // 5
                "aab",      // 2
                "abcdef",   // 6
                "ckilbkd"   // 5
        };

        for (int i = 0 ; i < tests.length ; i ++ ){
            int output = substring.lengthOfLongestSubstring(tests[i]);
            System.out.println("Our Answer is " + output + " For word " + tests[i] );
        }

    




    }
}