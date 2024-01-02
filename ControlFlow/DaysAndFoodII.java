package ControlFlow;

public class DaysAndFoodII {
    public static void main(String[] args) {
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        for (String day : days) {
            String food = switch(day) {
                case "Monday" -> "spaghetti";
                case "Tuesday" -> "tacos";
                case "Wednesday" -> "chicken";
                case "Thursday" -> "meatloaf";
                case "Friday" -> "hamburgers";
                case "Sunday" -> "pot roast";
                default -> "pizza";
            };

            System.out.printf("We eat %s on %s%n", food, day);
            System.out.printf("We eat %s on %s%n", capitalize(food), day); // capitalizing first letter
            System.out.printf("We eat %s on %s%n", capitalizeMultiWord(food), day); // capitalizing multi-word
        }

    }

    private static String capitalize (String food) {
        return food.substring(0,1).toUpperCase() + food.substring(1);
    }

    private static String capitalizeMultiWord (String food) {
        String[] words = food.split(" ");

        StringBuilder output = new StringBuilder(food.length() + 1);
        for (String word : words) {
            output.append(capitalize(word)).append(" ");
        }

        return output.toString().strip();
    }
}
