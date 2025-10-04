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

    public String returnValue(int number, int position) {

        char firstDigit = Integer.toString(number).charAt(0);

        int firstPosition = Math.multiplyExact(1, position);
        int secondPosition = Math.multiplyExact(5, position);

        StringBuilder output = new StringBuilder();
        if (number >= firstPosition
                && number < secondPosition) {
            String first = romanMap.get(firstPosition);
            for (int i = 1; i <= Character.getNumericValue(firstDigit); i++) {
                output.append(first);
            }

        } else if (number >= secondPosition
                && number < Math.multiplyExact(10, position)) {
            number = number - secondPosition;
            String first = romanMap.get(secondPosition);
            output.append(first);

            // fixed: only subtract while at least one `firstPosition` remains — prevents
            // infinite loop.
            while (number >= firstPosition) {
                number = number - firstPosition;
                output.append(romanMap.get(firstPosition));
            }

        }

        return output.toString();

    }

    public String foursandNine(int number) {

        char firstDigit = Integer.toString(number).charAt(0);
        String output;

        if (Character.getNumericValue(firstDigit) == 4) {
            output = romanMap.get(number);

        } else {
            output = romanMap.get(number);

        }

        return output;

    }

    public String oneToNine(int number) {

        StringBuilder results = new StringBuilder();
        while (number != 0) {

            char firstChar = Integer.toString(number).charAt(0);
            int length = Integer.toString(number).length();
            int Calculate = number - Math.multiplyExact(firstChar, (int) Math.pow(10, length - 1));
            number = number - Calculate;
            if (Integer.toString(number).charAt(0) == 4 || Integer.toString(number).charAt(0) == 9) {
                String output = foursandNine(number);
                results.append(output);
                number = Calculate;
                firstChar = Integer.toString(number).charAt(0);
            } else {
                String output = returnValue(number, (int) Math.pow(10, Integer.toString(number).length() - 1));
                results.append(output);
                number = Calculate;
                firstChar = Integer.toString(number).charAt(0);

            }

        }

        return results.toString();
    }

}