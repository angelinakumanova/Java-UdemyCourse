package ControlFlow;

public class DaysOfTheWeek {
    public static void main(String[] args) {
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        // Normal for-loop
        for (int i = 0; i < days.length; i++) {
            System.out.print(days[i] + " ");
        }

        System.out.println();
        // Enhanced for-loop
        for (String day : days) {
            System.out.print(day + " ");
        }

        System.out.println();
        // Every other output capitalized
        for (int i = 0; i < days.length; i++) {
            String output = i % 2 == 0 ? days[i] : days[i].toUpperCase();
            System.out.print(output + " ");
        }
    }
}
