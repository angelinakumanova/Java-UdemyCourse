package StreamsAndLambdas;


import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class Main {
    public static void main(String[] args) {
        //Exercise 1 - Using the same car collection approach as in the last section’s exercises, create a
        //collection of cars but use the Streams API to print out only the cars’ model names.

        Car car1 = new Car("BMW", "X6", 2020);
        Car car2 = new Car("Audi", "A3", 2010);
        Car car3 = new Car("Mercedes Benz", "AMG GT", 2019);
        Car car4 = new Car("BMW", "X5", 2014);
        Car car5 = new Car("BMW", "X5", 2014);

        List<Car> carsList = List.of(car1, car2, car3, car4, car5);
        carsList.forEach(car -> System.out.printf("%s %s ", car.getMake(), car.getModel()));

        System.out.println();
        //Exercise 2 - How could you use the Streams API to filter out (not show) all cars made before a certain year?

        carsList.stream()
                .filter(c -> c.getYear() > 2014)
                .forEach(car -> System.out.printf("%s %s %d ", car.getMake(), car.getModel(), car.getYear()));

        System.out.println();
        //Exercise 3 - How could you create a stream of cars without first explicitly creating a collection of cars?
        Stream<Car> carStream = Stream.of(new Car("BMW", "X6", 2020),
                                          new Car("Audi", "A3", 2010));

        /*Exercise 4 - Add an additional integer price field to your Car class/record. Use Streams to add total cost
        of all cars in your collection/stream.
        -Use Streams to find average price of all cars
        -How could you do exercise 4 with Streams & BigDecimal (for decimal accuracy)?
        -How could you do exercise 4.2 but output a formatted money String still using only the
        Streams API?
        -*/

        List<Car> cars = List.of(new Car("Audi", "A3", 2015, 60_000),
                new Car("BMW", "X6", 2020, 160_000),
                new Car("Mercedes Benz", "AMG GT", 2019, 140_000));

        double totalPriceOfAllCars = cars.stream().mapToDouble(Car::getPrice).sum();
        double averagePriceOfAllCars = cars.stream().mapToDouble(Car::getPrice).average().orElse(0);
        System.out.printf("Using primitives: Total -> US$%,.0f; Average -> US$%,.0f%n", totalPriceOfAllCars, averagePriceOfAllCars);

        BigDecimal totalPriceOfAllCarsBD = cars.stream().mapToDouble(Car::getPrice).mapToObj(BigDecimal::new).reduce(BigDecimal.ZERO, BigDecimal::add);
        BigDecimal averagePriceOfAllCarsBD = totalPriceOfAllCarsBD.divide(new BigDecimal(cars.size()));
        System.out.printf("Using BigDecimal: Total -> %s; Average -> %s",
                NumberFormat.getCurrencyInstance().format(totalPriceOfAllCarsBD),
                NumberFormat.getCurrencyInstance().format(averagePriceOfAllCarsBD));

        System.out.println();
        //*Exercise 5 Use the Streams API to sort a stream of cars in reverse order by model
        // Do so by sorting by make, then model, then year - all in one
        List<Car> carsSortedByMake = carsList.stream().sorted(Comparator.comparing(Car::getMake)).collect(Collectors.toList());
        List<Car> carsSortedByModel = carsList.stream().sorted(Comparator.comparing(Car::getModel)).collect(Collectors.toList());
        List<Car> carsSortedByYear = carsList.stream().sorted(Comparator.comparing(Car::getYear)).collect(Collectors.toList());
        List<Car> carsSortedByMakeModelAndYear = carsList.stream()
                .sorted(Comparator.comparing(Car::getMake)
                        .thenComparing(Car::getMake)
                        .thenComparing(Car::getYear))
                .collect(Collectors.toList());


        // Exercise 6 - Use only the Streams API and a collection or Stream of Car objects to produce the
        //following output: “S, X, 3, Y, Roadster”
        List<Car> carsTesla = new ArrayList<>();
        carsTesla.add(new Car("Tesla", "S", 2014));
        carsTesla.add(new Car("Tesla", "X",2015));
        carsTesla.add(new Car("Tesla", "3", 2016));
        carsTesla.add(new Car("Tesla", "Y", 2017));
        carsTesla.add(new Car("Tesla", "Roadster", 2009));


        Optional<String> models = carsTesla.stream()
                .map(Car::getModel)
                .reduce((a, b) -> a.concat(", ").concat(b));
        System.out.println(models.get());


        /* Exercise 7
        Add more different makes of cars to your collection of cars and then
        1. Determine total price by make
        2. Determine average car price by make
            1. This one will be fun/challenging. You’ll want to take a look at the Collectors.teeing()
            function, which I did not explicitly teach but have a look at its javadoc. If this proves
            to be too hard but you want to still try it without looking @ my solution, it will be
            MUCH easier if you convert the prices to any other numeric type before using
            Streams API (but not as much fun…)
            2. Did you get 7.2.1? Let’s make it even more fun. Format the average prices for
            currency, within the Streams API.

        3. Determine number of cars by year and then by make
        4. Determine number of cars by make by first creating a new, empty Map, then iterating
        over the collection of cars (you’ve been using for previous exercises) and using a
        functional method of the Map interface to populate your empty Map.
         */

        record Car(String make, String model, int year, BigDecimal price){}
        List<Car> carsCollection = List.of(
                new Car("Tesla", "S", 2014, new BigDecimal("90000.99")),
                new Car("Tesla", "X", 2015, new BigDecimal("110000.99")),
                new Car("Tesla", "3", 2016, new BigDecimal("55000.99")),
                new Car("Tesla", "Y", 2017, new BigDecimal("60000.99")),
                new Car("Tesla", "Roadster", 2009, new BigDecimal("135000.99")),
                new Car("Lucid", "Air", 2021, new BigDecimal("77399.99")),
                new Car("Hyundai", "Ioniq", 2021, new BigDecimal("34250.00")),
                new Car("Hyundai", "Kona", 2021, new BigDecimal("38575.00")),
                new Car("Porsche", "Taycan", 2021, new BigDecimal("81250.00")),
                new Car("Audi", "e-tron", 2021, new BigDecimal("66995.00")),
                new Car("Volkswagen", "ID.4", 2021, new BigDecimal("41190"))
        );

        Map<String, BigDecimal> sumByMake = carsCollection.stream()
                .collect(groupingBy(
                        Car::make,
                        reducing(BigDecimal.ZERO, Car::price, BigDecimal::add)));
        System.out.println(sumByMake);

        Map<String, String> averageByMake = carsCollection.stream()
                .collect(groupingBy(Car::make,
                        Collectors.collectingAndThen(
                        Collectors.teeing(
                                counting(),
                                reducing(BigDecimal.ZERO, Car::price, BigDecimal::add),
                                (count, total) -> total.divide(BigDecimal.valueOf(count))
                        ),
                        NumberFormat.getCurrencyInstance()::format)
        ));

        System.out.println(averageByMake);



        Map<Integer, Map<String, Long>> countByYearAndMake = carsCollection.stream()
                .collect(groupingBy(Car::year,
                        groupingBy(Car::make, counting())));

        System.out.println(countByYearAndMake);


        Map<String, Integer> countsByMake = new HashMap<>();
        carsCollection.stream()
                .forEach(car -> countsByMake.merge(car.make, 1, Integer::sum));

        System.out.println(countsByMake);
    }
}
