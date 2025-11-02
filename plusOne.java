import java.math.BigInteger;

class Solution {

    public int[] plusOne(int[] digits) {

        StringBuilder values = new StringBuilder();

        for (int vals : digits) {
            values.append(vals);
        }
        

        BigInteger bigNum = new BigInteger(values.toString());
        bigNum = bigNum.add(BigInteger.ONE);
        String numStr = bigNum.toString();
        int[] digitss = new int[numStr.length()];

        for (int i = 0; i < numStr.length(); i++) {
            digitss[i] = numStr.charAt(i) - '0';
        }

        return digitss;

    }

}