import java.math.BigInteger;

public class Valid {
    public static void main(String[] args) {

        Valid newValid = new Valid();
        int[] vals = { 12, 34 };
        newValid.plusOne(vals);

    }

    public int[] plusOne(int[] digits) {

        StringBuilder values = new StringBuilder();

        for (int vals : digits) {
            values.append(vals);
        }

        BigInteger bigNum = new BigInteger(values.toString());
        bigNum.add(BigInteger.ONE);
        String numStr = bigNum.toString();
        int[] digitss = new int[numStr.length()];

        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0';
        }

        return digitss;

    }

}