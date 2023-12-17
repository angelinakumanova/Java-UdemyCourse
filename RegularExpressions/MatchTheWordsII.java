package RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchTheWordsII {
    public static void main(String[] args) {
        String words = "Abracadabra Agracadagra";

        String regex = "A(\\w{3})cada\\1\\b";

        Pattern pat = Pattern.compile(regex);
        Matcher mat = pat.matcher(words);

        while (mat.find()) {
            System.out.println(mat.group(1));
        }
    }
}
