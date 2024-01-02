package ControlFlow;

public class DaysAndFood {
    public static void main(String[] args) {
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        // I Solution
        for (String day : days) {
            if (day.equals("Monday")) {
                System.out.println("We eat spaghetti on Monday ");
            } else if (day.equals("Tuesday")) {
                System.out.println("We eat tacos on Tuesday");
            } else if (day.equals("Wednesday")) {
                System.out.println("We eat chicken on Wednesday");
            } else if (day.equals("Thursday")) {
                System.out.println("We eat meatloaf on Thursday");
            } else if (day.equals("Friday")) {
                System.out.println("We eat hamburgers on Friday");
            } else if (day.equals("Saturday")) {
                System.out.println("We eat pizza on Saturday");
            } else if (day.equals("Sunday")) {
                System.out.println("We eat pot roast on Sunday");
            }
        }

        System.out.println();
        // II Solution
        for (String day : days) {
            switch (day) {
                case "Monday" -> System.out.println("We eat spaghetti on Monday ");
                case "Tuesday" -> System.out.println("We eat tacos on Tuesday");
                case "Wednesday" -> System.out.println("We eat chicken on Wednesday");
                case "Thursday" -> System.out.println("We eat meatloaf on Thursday");
                case "Friday" -> System.out.println("We eat hamburgers on Friday");
                case "Saturday" -> System.out.println("We eat pizza on Saturday");
                case "Sunday" -> System.out.println("We eat pot roast on Sunday");
            }
        }


    }
}
