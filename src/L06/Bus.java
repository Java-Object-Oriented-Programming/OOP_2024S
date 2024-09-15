package L06;

public class Bus extends Vehicle implements IMove {

    private double driver_cost;
    public static int B_COUNT = 0;

    public Bus(Bus bus) {
        this.driver_cost = bus.driver_cost;
        this.license_number = bus.license_number;
        this.make = bus.make;
        this.model = bus.model;
        this.price = bus.price;
        B_COUNT++;

    }

    public Bus(double driver_cost) {
        this.driver_cost = driver_cost;
        B_COUNT++;
    }

    public Bus(String make, String model, double driver_cost) {
        super(make, model);
        this.driver_cost = driver_cost;
        B_COUNT++;
    }

    public Bus(String model, double price, String make, double driver_cost) {
        super(model, price, make);
        this.driver_cost = driver_cost;
        B_COUNT++;
    }

    public Bus(String license_number, String make, String model, double price, double driver_cost) {
        super(license_number, make, model, price);
        this.driver_cost = driver_cost;
        B_COUNT++;
    }


    @Override
    public void start() {
        System.out.println("start frm Bus");
    }

    public double getPrice() {

        return price * Vehicle.BUS_FACTOR;
    }

    public double getDriver_cost() {
        return driver_cost;
    }

    public void setDriver_cost(double driver_cost) {
        this.driver_cost = driver_cost;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "driver_cost=" + driver_cost +
                '}' + super.toString();
    }

    @Override
    public void left() {
        System.out.println("bus left");
    }
}
