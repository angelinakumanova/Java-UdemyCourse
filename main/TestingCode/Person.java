package TestingCode;

import java.util.Objects;

public class Person {
    private String firstName;
    private String lastName;
    private String streetAddress;
    private String city;
    private String state;
    private String zipcode;

    public Person(String firstName, String lastName, String streetAddress, String city, String state, String zipcode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    public static Person convert(String csv) {
        String[] tokens = csv.split(", ");
        String firstName = tokens[0];
        String lastName = tokens[1];
        String streetAddress = tokens[2];
        String city = tokens[3];
        String state = tokens[4];
        String zipcode = tokens[5];
        return new Person(firstName, lastName, streetAddress, city, state, zipcode);
    }
    public static Person[] convertMulti(String multiCSV) {
        String[] peopleStrings = multiCSV.split("\\|");
        Person[] people = new Person[peopleStrings.length];

        for (int i = 0; i < people.length; i++) {
            people[i] = convert(peopleStrings[i]);
        }

        return people;
    }


    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, streetAddress, city, state, zipcode);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName)
                && Objects.equals(streetAddress, person.streetAddress) && Objects.equals(city, person.city)
                && Objects.equals(state, person.state) && Objects.equals(zipcode, person.zipcode);
    }
}
