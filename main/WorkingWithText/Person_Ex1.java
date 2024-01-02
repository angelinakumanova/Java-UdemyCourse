package WorkingWithText;

public class Person_Ex1 {
    private String firstName;
    private String lastName;

    public Person_Ex1(String firstName, String lastName) {
        this.firstName = firstName.toUpperCase();
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person -> " +
                "firstName: " + firstName +
                ", lastName: " + lastName;
    }

    public static void main(String[] args) {
        Person_Ex1 person = new Person_Ex1("jake", "Jackson");

        System.out.println(person);
    }
}
