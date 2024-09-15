package L06;

public abstract class Vehicle implements IMove{
    protected static double BUS_FACTOR = 1.5;
    protected static double CAR_FACTOR = 1.2;
    protected static double MOTOR_FACTOR = 0.7;
    public static int V_COUNT = 0;

    protected String license_number;
    protected String make;
    protected String model;
    protected double price;


    public Vehicle(Vehicle vehicle) {
        this.license_number = vehicle.license_number;
        this.make = vehicle.make;
        this.model = vehicle.model;
        this.price = vehicle.price;
        V_COUNT++;
    }


    public Vehicle() {
        V_COUNT++;
    }

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
        V_COUNT++;
    }

    public Vehicle(String model, double price, String make) {
        this.model = model;
        this.price = price;
        this.make = make;
        V_COUNT++;
    }

    public Vehicle(String license_number, String make, String model, double price) {
        this.license_number = license_number;
        this.make = make;
        this.model = model;
        this.price = price;
        V_COUNT++;
    }

    public static boolean isPriceEquals(Vehicle obj1, Vehicle obj2) {
        return obj1.getPrice() == obj2.getPrice();
    }

    public static boolean isEquals(Vehicle obj1, Vehicle obj2) {
        return (obj1.getClass() == obj2.getClass() && isPriceEquals(obj1, obj2));
    }

    public final void bip() {
        System.out.println("bip bip");
    }

    public abstract void start();

    public String getLicense_number() {
        return license_number;
    }

    public void setLicense_number(String license_number) {
        this.license_number = license_number;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "license_number='" + license_number + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
