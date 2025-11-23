import java.util.HashMap;


class Solution {
    public  static HashMap<Character, Integer> romanMap = new HashMap<>();
    static {
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
    }

    public int romanToInt(String s) {
        int total = 0;

        for (int i = 0 ; i < s.length() ; i++) {

            int val1 = romanMap.get(s.charAt(i));
            int val2 = (i + 1 >= s.length()) ? 0 : romanMap.get(s.charAt(i + 1));
            int totall = val1 + val2;

            if (val2 > val1 && (totall % 6 == 0 || totall % 11 == 0)) {
                total += val2 - val1;
                i++;
            } else {
                total += val1;
            }
        }

        return total;
    }
}
