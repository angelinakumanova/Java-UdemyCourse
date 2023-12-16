package RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParsingARealDocument {
    public static void main(String[] args) {
        String text = """
                Student Number:	1234598872			Grade:		11
                Birthdate:		01/02/2000			Gender:	M
                State ID:		8923827123
                                
                Cumulative GPA (Weighted)		3.82
                Cumulative GPA (Unweighted)	3.46
                """;

        String regex = """
                Student\\sNumber:\\s(?<studentNum>\\d{10}).* # Grab student number
                Grade:\\s+(?<grade>\\d{1,2}).* # Grab grade
                Birthdate:\\s+(?<day>\\d{2})/(?<month>\\d{2})/(?<year>\\d{4}).* # Grab birthdate
                Gender:\\s(?<gender>\\w+)\\b.* # Grab gender
                State\\sID:\\s+(?<stateID>\\d+).* # Grab state ID
                \\(Weighted\\)\\s+(?<weightedGPA>[\\d.]+).* # Grab weighted GPA
                \\(Unweighted\\)\\s+(?<unweightedGPA>[\\d.]+).* # Grab unweighted GPA
                """;
        Pattern pat = Pattern.compile(regex, Pattern.DOTALL | Pattern.COMMENTS);
        Matcher mat = pat.matcher(text);

        if (mat.find()) {

            System.out.println(mat.group("studentNum"));
            System.out.println(mat.group("grade"));
            System.out.println(mat.group("day"));
            System.out.println(mat.group("month"));
            System.out.println(mat.group("year"));
            System.out.println(mat.group("gender"));
            System.out.println(mat.group("stateID"));
            System.out.println(mat.group("weightedGPA"));
            System.out.println(mat.group("unweightedGPA"));
        }
    }
}
