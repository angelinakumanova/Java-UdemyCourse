package ClassesObjectsAndMethods;

public class People {
    //Model a class with data that enumerates (associates with a number) the first names of three
    //friends, classmates or coworkers. Make it so that this name data will be shared among all
    //instances of the class.

    public static final String[] people = {"Alex", "Sam", "Annie"};

    public String[] getPeople() {
        return People.people;
    }

    public static void main(String[] args) {
        People p1 = new People();
        People p2 = new People();
        People p3 = new People();

        System.out.println(p1.getPeople()[0]);
        System.out.println(p1.getPeople()[1]);
        System.out.println(p1.getPeople()[2]);

        System.out.println(p2.getPeople()[0]);
        System.out.println(p2.getPeople()[1]);
        System.out.println(p2.getPeople()[2]);

        System.out.println(p3.getPeople()[0]);
        System.out.println(p3.getPeople()[1]);
        System.out.println(p3.getPeople()[2]);


    }
}
