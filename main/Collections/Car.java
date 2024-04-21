package Collections;

import java.util.Objects;

public class Car implements Comparable<Car> {
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getModel() {
        return model;
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
