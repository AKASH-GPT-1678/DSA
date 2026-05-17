
public class Test {

    public static void main(String[] args){

        Palindrome newpalin = new Palindrome();
        int[] testInputs = {
                111111,
                1000000001,
                9889,
                1221,
                44444444,
                12021,
                100010,
                1001001,
                90000009,
                2147447412
        };

        for (int num : testInputs) {
            System.out.println(num + " → " + newpalin.isPalindrome(num));
        }


    }
}