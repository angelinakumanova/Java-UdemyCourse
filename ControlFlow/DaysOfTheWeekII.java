package ControlFlow;

public class DaysOfTheWeekII {
    public static void main(String[] args) {
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        int count = 0;

        while (count < days.length) {
            System.out.print(days[count] + " ");
            count++;
        }

        System.out.println();

        // capitalized
        count = 0;
        while (count < days.length) {
            String day = count % 2 == 0 ? days[count] : days[count].toUpperCase();
            System.out.print(day + " ");
            count++;
        }

        System.out.println();
        // do -  while loop
        count = 0;
        do {
            System.out.print(days[count] + " ");
            count++;
        } while (count < days.length);
    }
}
