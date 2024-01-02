package WorkingWithText;

public class Ex5 {
    public static void main(String[] args) {
        String input = "12345 Big St., Alphabet City, CA 90210";

        String firstPart = input.split(", ")[0];
        String buildingNumber = firstPart.substring(0, firstPart.indexOf(" "));
        String street = firstPart.substring(firstPart.indexOf(" ") + 1);

        String city = input.split(", ")[1];

        String thirdPart = input.split(", ")[2];
        String state = thirdPart.split(" ")[0];
        String postalCode = thirdPart.split(" ")[1];

        printInfo(buildingNumber, street, city, state, postalCode);

    }

    public static void printInfo(String buildingNumber, String street, String city, String state, String postalCode) {
        System.out.println("The building number: " + buildingNumber);
        System.out.println("The Street: " + street);
        System.out.println("City: " + city);
        System.out.println("State: " + state);
        System.out.println("Postal Code: " + postalCode);
    }
}
