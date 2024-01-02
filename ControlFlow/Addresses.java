package ControlFlow;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Addresses {
    public static void main(String[] args) {
        String text = """
                12345 First Street, First City, AA 90210
                22222 Second Street, Second City, BB 22222
                33333 Third Street, Third City, CC 33333
                44444 Fourth Street, Fourth City, DD 44444
                55555 Fifth Street, Fifth City, EE 55555
                66666 Sixth Street, Sixth City, FF 66666
                77777 Seventh Street, Seventh City, GG 77777
                88888 Eighth Street, Eighth City, HH 88888
                99999 Ninth Street, Ninth City, II 99999
                00000 Tenth Street, Tenth City, JJ 00000
                """;

        String regex = "(?<street>.*?),\\s+(?<city>.*?),\\s+(?<state>[A-Z]{2})\\s+(?<zip>\\d{5})$";

        Pattern pat = Pattern.compile(regex, Pattern.MULTILINE);
        Matcher mat = pat.matcher(text);

        while (mat.find()) {
            System.out.println("Street: " + mat.group("street"));
            System.out.println("City: " + mat.group("city"));
            System.out.println("State: " + mat.group("state"));
            System.out.println("ZIP code: " + mat.group("zip"));
            System.out.println();
        }
    }


}
