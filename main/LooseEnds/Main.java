package LooseEnds;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

public class Main {
    /*Create a collection of at least five Person objects with first name & last name fields. Add a
    //few null objects to the collection in random places. Use an enhanced for-loop to iterate
    //over the collection and print out the first names of each person. Use Optional to prevent
    //NullPointerException and to print “Unknown” for the first names of null items.
    //1. Use the Optional API to display “Unknown” for null entries and entries whose first name
    is shorter than 3 characters */
    record Person (String firstName, String lastName) {}
    public static void main(String[] args) {
        Collection<Person> people = new ArrayList<>();
        people.add(new Person("Ivan", "Ivanov"));
        people.add(new Person("Georgi", "Georgiev"));
        people.add(null);
        people.add(new Person("Pe", "Petrov"));
        people.add(new Person("John", "Johnson"));
        people.add(null);

        for (Person person : people) {
            String firstName = Optional.ofNullable(person)
                    .map(Person::firstName)
                    .filter(name -> name.length() > 3)
                    .orElse("Unknown");

            System.out.println(firstName);
        }

    }



}
