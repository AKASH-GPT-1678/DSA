import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestPatterns {

    public static void main(String[] args){
        System.out.println("My Name is Ganesh Kumar");
        String pattern = "\\d{10}";
        Pattern pattern1 = Pattern.compile(pattern);
        Matcher matcher = pattern1.matcher("7208353083");
        while (matcher.find()) {
            System.out.println("Found digit: " + matcher.group());
        }
        String patterns = "^$";
        Pattern patterns1 = Pattern.compile(patterns);
        Matcher matchers = patterns1.matcher("Akashkanh");
        boolean matches = matchers.matches();
        System.out.println("Match is " + matches);

        String userPattern = "[a-zA-z]{5,10}\\w[a-zA-Z]{1,3}\\d\\d$";
        Pattern userName = Pattern.compile(userPattern);
        Matcher matches1 = userName.matcher("akash_gpt16");
        boolean output = matches1.matches();
        System.out.println("Match is " + output);


        String instaUserName = "\\w{5,15}";
        Pattern myName = Pattern.compile(instaUserName);
        Matcher matcher1 = myName.matcher("acash_editz");
        boolean output2 = matcher1.matches();
        System.out.println("Instagram : " + output2 );

        String aadharName = "^[a-zA-Z]+\\s[a-zA-Z]+\\s[a-zA-Z]+$";
        Pattern aadharPattern = Pattern.compile(aadharName);
        Matcher aadharNums = aadharPattern.matcher("Akash Dinesh Gupta");
        boolean output3 = aadharNums.matches();
        System.out.println("Output 3 is " + output3);

        String nums = "\\W+";
        Pattern nonCharPattern = Pattern.compile(nums);
        Matcher nonChar = nonCharPattern.matcher("$%*#@");
        boolean output4 = nonChar.matches();
        System.out.println("Non Char is " + output4);

        String location = "^[a-zA-Z]+\\s?(pur|garh|bad)$";
        Pattern locationPattern = Pattern.compile(location);
        Matcher output5 = locationPattern.matcher("Chandigarh");
        Matcher output6 = locationPattern.matcher("Jaipur");
        Matcher output7 = locationPattern.matcher("Nadia bad");
        Matcher output8 = locationPattern.matcher("Chennai");
        System.out.println("Chandigarh : " + output5.matches());
        System.out.println("Jaipur : " + output6.matches());
        System.out.println("Nadia bad : " + output7.matches());
        System.out.println("Chennai : " + output8.matches());


        String website = "^(www)\\.[a-zA-Z]+\\.(com)";
        Pattern websitePat = Pattern.compile(website);
        Matcher webMatch = websitePat.matcher("www.flipkart.com");
        System.out.println("Website Pattern " + webMatch.matches());






    }
}
