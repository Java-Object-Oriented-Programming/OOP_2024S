package L06;

import java.sql.SQLOutput;

public class Car extends Vehicle implements IMove {


    private double trunkSize;
    public static int C_COUNT = 0;


    public Car(Car car){
        this.license_number = car.license_number;
        this.make = car.make;
        this.model = car.model;
        this.price = car.price;
        C_COUNT++;
    }
    public void start(){
        System.out.println("start frm Car");
    }

    public Car(double trunkSize) {
        this.trunkSize = trunkSize;
        C_COUNT++;
    }

    public Car(String make, String model, double trunkSize) {
        super(make, model);
        this.trunkSize = trunkSize;
        C_COUNT++;
    }

    public Car(String model, double price, String make, double trunkSize) {
        super(model, price, make);
        this.trunkSize = trunkSize;
        C_COUNT++;
    }

    public Car(String license_number, String make, String model, double price, double trunkSize) {
        super(license_number, make, model, price);
        this.trunkSize = trunkSize;
        C_COUNT++;
    }

//    public void bip(){
//
//
//    }

    public double getTrunkSize() {
        return trunkSize;
    }


    public void setTrunkSize(double trunkSize) {
        if (trunkSize > 0) {
            this.trunkSize = trunkSize;
        } else {
            System.out.println("Trunk size must be positive.");
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "trunkSize=" + trunkSize +
                ", license_number='" + license_number + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public void left() {
        System.out.println("Car left");
    }
}
