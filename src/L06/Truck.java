package L06;

public class Truck extends Car {

    public static int T_COUNT = 0;

    public Truck(Truck truck) {
        super(truck.make
                , truck.model
                , truck.price);
        this.license_number = truck.license_number;
        T_COUNT++;
    }

    public Truck(double trunkSize) {
        super(trunkSize);
        T_COUNT++;
    }

    public Truck(String make, String model, double trunkSize) {
        super(make, model, trunkSize);
        T_COUNT++;

    }

    public Truck(String model, double price, String make, double trunkSize) {
        super(model, price, make, trunkSize);
        T_COUNT++;
    }

    public Truck(String license_number, String make, String model, double price, double trunkSize) {
        super(license_number, make, model, price, trunkSize);
        T_COUNT++;
    }

    @Override
    public String toString() {
        return "Truck{}" + super.toString();
    }
}
