package WorkingWithText;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // Before replacing
        System.out.println(input);

        input = input.replace("cat", "dog");
        // After replacing
        System.out.println(input);
    }
}
