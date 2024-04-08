package MoreOOP.Exercise7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String letter = input.split("")[0];
        int number = Integer.parseInt(input.split("")[1]);

        System.out.println(ChessLetters.valueOf(letter).getPosition() + ", " + String.valueOf(8 - number));


    }
}
