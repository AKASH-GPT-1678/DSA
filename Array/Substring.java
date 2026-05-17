package Array;

public class Substring {

    public int lengthOfLongestSubstring(String s) {
        StringBuilder first_val = new StringBuilder();
        StringBuilder second_val = new StringBuilder();
        for (int i = 0 ; i < s.length() ; i++){
            String word = String.valueOf(s.charAt(i));
            if (!first_val.toString().contains(word)) {
                first_val.append(word);

            }
            else {
                break;
            }
        }


        int count = 1;

        for (int i = 1 ; i < s.length() ; i++){
            String letter = String.valueOf(s.charAt(i));
            if (!second_val.toString().contains(letter)){
                second_val.append(letter);
                if (second_val.length() > first_val.length()){
                    first_val = second_val;

                }
            }
            else {
                while (second_val.toString().contains(letter)) {
                    second_val.deleteCharAt(0);
                }

                second_val.append(letter);

                if (second_val.length() > first_val.length()) {
                    first_val = new StringBuilder(second_val);
                }
            }
        }

        return first_val.length();

    }
}
