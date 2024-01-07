package TestingCode;

public class Exercise1 {


    public static String alternateCaps(String input) {
        StringBuilder sb = new StringBuilder(input.length());
        for (int i = 0; i < input.length(); i++) {
            String currentLetter = String.valueOf(input.charAt(i));
            if (i % 2 == 0) {
                sb.append(currentLetter);
            } else {
                sb.append(currentLetter.toUpperCase());
            }
        }
        return sb.toString();
    }
}
