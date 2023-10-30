package assignment;

import java.sql.SQLOutput;

public class Car {
    String Make;
    String model;
    int year;

    public Car(String make, String model, int year) {
        Make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return Make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Make='" + Make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }

    public static void main(String[] args) {
        Car car = new Car("Toyota","Camry",2020);
        System.out.println("Make = " + car.getMake());
        System.out.println("Model = " + car.getModel());
        System.out.println("Year = " + car.getYear());

        System.out.println("Car details: " + car.toString());
    }
}
