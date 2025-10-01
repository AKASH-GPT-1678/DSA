import java.util.LinkedHashMap;
import java.util.Map;

class Main {
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

    public String remaiNingOnes(int number, int position) {

        char firstDigit = Integer.toString(number).charAt(0);
        String length = Integer.toString(number).toString();
        String output;
        if (number > Math.multiplyExact(1, position)
                && number < Math.multiplyExact(5, position)) {
            String first = romanMap.get(Math.multiplyExact(1, position));

        } else if (number > Math.multiplyExact(5, position)
                && number < Math.multiplyExact(10, position)) {

        }

        return "";

    }

    public String foursandNine(int number, int position) {
        char firstDigit = Integer.toString(number).charAt(0);
        String output;

        if (Character.getNumericValue(firstDigit) == 4) {
            output = romanMap.get(number);

        } else {
            output = romanMap.get(number);

        }

        return output;

    }

}