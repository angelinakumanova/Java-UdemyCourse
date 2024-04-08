package MoreOOP.Exercise4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //First Problem
        String letter = scanner.nextLine();

        System.out.println(letter + " -> " + Letters.valueOf(letter).getPosition());

        //Second Problem
        int number = Integer.parseInt(scanner.nextLine());

        for (Letters l : Letters.values()) {
            if (l.getPosition() == number) {
                System.out.print(number + " -> " + l.toString());
            }
        }
        System.out.println();


        //Third Problem
        String[] input = {"8->1", "7->1", "6->2", "5->3", "4->4", "3->5", "2->6", "1->7"};

        for (String s : input) {
            int firstNumber = Integer.parseInt(s.split("->")[0]);
            int secondNumber = Integer.parseInt(s.split("->")[1]);

            String firstLetter = getLetter(firstNumber);
            String secondLetter = getLetter(secondNumber);

            System.out.print(firstLetter + "->" + secondLetter + " ");

        }
    }

    private static String getLetter(int number) {
        for (Letters l : Letters.values()) {
            if (l.getPosition() == number) {
                return l.toString();
            }
        }
        return "non-existent";
    }
}
