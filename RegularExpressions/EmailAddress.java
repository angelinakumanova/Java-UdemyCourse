package RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailAddress {
    public static void main(String[] args) {
        String email = "first.last@domain.com";

        String regex = "(?<name>[\\w.]+)@(?<domain>[a-z]+).(?<end>[a-z]+)";
        Pattern pat = Pattern.compile(regex);
        Matcher mat = pat.matcher(email);

        if (mat.find()) {
            System.out.println("Name: " + mat.group("name"));
            System.out.println("Domain: " + mat.group("domain"));
            System.out.println("End: " + mat.group("end"));
        }
    }
}
