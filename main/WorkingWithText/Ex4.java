package WorkingWithText;

public class Ex4 {
    public static void main(String[] args) {
        String input = " alphabet ";
        input = input.trim();
        String firstPart = input.substring(0, input.length() - 1);
        String lastLetter = input.substring(input.length() - 1);

        System.out.println(firstPart + lastLetter.toUpperCase());
    }
}
