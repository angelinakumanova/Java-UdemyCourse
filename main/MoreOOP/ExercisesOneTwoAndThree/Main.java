package MoreOOP.ExercisesOneTwoAndThree;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        DaysOfTheWeek[] daysOfTheWeeks = DaysOfTheWeek.values();
        // First Problem - Printing the Enums
        for (DaysOfTheWeek day : daysOfTheWeeks) {
            System.out.print(day + " ");
        }

        System.out.println();
        // Second Problem - Alternate between printing the first letter capitalized or whatever letter is approximately
        //in the middle of the word.
        for (int i = 0; i < daysOfTheWeeks.length; i++) {
            if (i % 2 == 0) {
                int middleIndex = daysOfTheWeeks[i].toString().length() / 2;
                String leftPart = daysOfTheWeeks[i].toString().substring(0, middleIndex);
                String middleLetter = daysOfTheWeeks[i].toString().substring(middleIndex, middleIndex + 1).toUpperCase();
                String rightPart = daysOfTheWeeks[i].toString().substring(middleIndex + 1);

                String alteredWord = leftPart + middleLetter + rightPart;
                System.out.print(alteredWord + " ");
            } else {
                System.out.print(daysOfTheWeeks[i] + " ");
            }
        }

        System.out.println();


        // Third Problem - Print 10 randomly-chosen days of the week
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            System.out.print(daysOfTheWeeks[random.nextInt(7)] + " ");
        }
        System.out.println();


        //Exercise 2 -> print these messages without using conditionals

        //We eat spaghetti on Monday
        //We eat tacos on Tuesday
        //We eat chicken on Wednesday
        //We eat meatloaf on Thursday
        //We eat hamburgers on Friday
        //We eat pizza on Saturday
        //We eat pot roast on Sunday


        for (DaysOfTheWeek day : daysOfTheWeeks) {
            System.out.println("We eat " + day.getFood() + " on " + day.toString());
        }


        // Exercise 3 -> print the food related to the given day
        String[] input = new String[]{"Friday", "Thursday" , "Monday" , "Saturday" , "Tuesday"};

        for (String day : input) {
            System.out.print(DaysOfTheWeek.valueOf(day).getFood() + " ");
        }
    }
}
