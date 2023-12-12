package ClassesObjectsAndMethods.Car;

public class Car {
    private String brand;

    private String model;

    private String year;

    public Car(String brand, String model, String year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car: " +
                "brand= " + brand +
                ", model= " + model  +
                ", year= " + year;
    }
}
