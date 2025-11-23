class Valid {
    public String addBinary(String a, String b) {
        int greater = (a.length() >= b.length()) ? a.length() : b.length();


        String longer = (a.length() >= b.length()) ? a : b;
        String shorter = (a.length() >= b.length()) ? b : a;
        String result = String.format("%" + greater + "s", shorter).replace(' ', '0');

        int carry = 0;
        StringBuilder words = new StringBuilder();

        for (int i = greater - 1; i >= 0; i--) {
            int A = longer.charAt(i) - '0';
            int B = result.charAt(i) - '0';

            int val = A + B + carry;

            words.append(val % 2);
            carry = val / 2;
        }

        if (carry == 1) {
            words.append('1');
        }

        return words.reverse().toString();
    }
}

