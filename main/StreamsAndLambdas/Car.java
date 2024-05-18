package StreamsAndLambdas;

import java.util.Objects;

public class Car implements Comparable<Car> {
    private String make;
    private String model;
    private int year;
    private double price;

    public Car(String make, String model, int year) {
        this(make, model, year, -1);
    }

    public Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }



    public String getModel() {
        return model;
    }

    public String getMake() {
        return make;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return make + " " + model + " " + year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year && Objects.equals(make, car.make) && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(make, model, year);
    }

    @Override
    public int compareTo(Car o) {
        return this.model.compareTo(o.model);
    }
}
