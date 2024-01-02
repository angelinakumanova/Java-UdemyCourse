package RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchTheWords {
    public static void main(String[] args) {
        String words = "Dark bark Lark stark";

        String regex = "(?<word>\\w+ark)+";

        Pattern pat = Pattern.compile(regex);
        Matcher mat = pat.matcher(words);

        while (mat.find()) {
            System.out.println(mat.group("word"));
        }
    }
}
