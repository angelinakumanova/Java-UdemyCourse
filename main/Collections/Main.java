package Collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //1.Write code that allows you to model and store a collection of at least 5 cars and keeps
        //them in the order in which they were entered. Print them out to the screen also.
        Car car1 = new Car("BMW", "X6", 2020);
        Car car2 = new Car("Audi", "A3", 2010);
        Car car3 = new Car("Mercedes Benz", "AMG GT", 2019);
        Car car4 = new Car("BMW", "X5", 2014);
        Car car5 = new Car("BMW", "X5", 2014);

        List<Car> carsList = List.of(car1, car2, car3, car4, car5);
        System.out.println(carsList);

        //2. Same as exercise 1 except we don’t care about retaining the order and we want to ensure
        //that duplicates will not exist.
        Set<Car> carsSet = new HashSet<>(carsList);
        System.out.println(carsSet);
        
        //3.Same as exercise 1 but associate an owner’s first name with each car. Do not add owner’s 
        //name to your car model class. Print out each owner with their car.
        Map<String, Car> ownersOfCars = new HashMap<>();
        ownersOfCars.put("Bob", car2);
        ownersOfCars.put("Jenny", car1);
        ownersOfCars.put("Sarah", car5);
        ownersOfCars.put("Jeremy", car3);
        ownersOfCars.put("John", car4);
        System.out.println(ownersOfCars);

        //4.If you implemented exercise 2 with a record (instead of a class), do it again using a class or
        //vice-versa.
        CarRecord carRecord1 = new CarRecord("BMW", "X6", 2020);
        CarRecord carRecord2 = new CarRecord("BMW", "X6", 2020);
        CarRecord carRecord3 = new CarRecord("Audi", "A3", 2010);
        CarRecord carRecord4 = new CarRecord("Mercedes Benz", "AMG GT", 2019);
        List<CarRecord> carsRecordList = List.of(carRecord1, carRecord2, carRecord3, carRecord4);

        Set<CarRecord> carRecordSet = new HashSet<>(carsRecordList);
        System.out.println(carRecordSet);

        /*
        5.Allow the cars from exercise 2 to be printed in “natural” order by model.
        -Store the same cars in a List and sort them. (No code solution provided)
        -Store the same cars in a List and sort them without implementing any interfaces on the Car class.
        -How could you reverse the sort order?
         */

        Set<Car> cars = new TreeSet<>(carsList);
        System.out.println(cars);

        Set<Car> cars2 = new TreeSet<>(Comparator.comparing((Car e) -> e.getModel()));
        cars2.addAll(carsList);
        System.out.println(cars2);

        Set<Car> cars3 = new TreeSet<>((c1, c2) -> c2.getModel().compareTo(c1.getModel()));
        cars3.addAll(carsList);
        System.out.println(cars3);

        
    }
}
