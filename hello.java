import java.util.LinkedHashMap;
import java.util.Map;
public class hello extends Exception {
       public static Map<Integer, String> romanMap = new LinkedHashMap<>();

    
    static {
        romanMap.put(1000, "M");
        romanMap.put(900, "CM");
        romanMap.put(500, "D");
        romanMap.put(400, "CD");
        romanMap.put(100, "C");
        romanMap.put(90, "XC");
        romanMap.put(50, "L");
        romanMap.put(40, "XL");
        romanMap.put(10, "X");
        romanMap.put(9, "IX");
        romanMap.put(5, "V");
        romanMap.put(4, "IV");
        romanMap.put(1, "I");
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int var1 = 20;
        var1 = 200;

    }

    public String remaiNingOnes(int number, int position) {
        int length = String.valueOf(number).length();
        char firstDigit = Integer.toString(number).charAt(0);
        if (number > Math.multiplyExact(1, position)
                && number < Math.multiplyExact(5, position)) {

        } else if (number > Math.multiplyExact(5, position)
                && number < Math.multiplyExact(10, position)) {

        }

        return "";

    }

    public String foursandNine(int number, int position) {
        char firstDigit = Integer.toString(number).charAt(0);
        String output;
        String[] fours = { "IV", "XL", "CD" };
        String[] nines = { "IX", "XC", "CM" };

        if (Character.getNumericValue(firstDigit) == 4) {
            output = fours[position - 2].toString();

        } else {
            output = nines[position - 2].toString();

        }

        return output;

    }

}