package L06;

public final class RacingCar extends Car {

    public static int RC_COUNT = 0;
    public RacingCar(RacingCar racingCar){
        super(racingCar.make,racingCar.model, racingCar.price);
        this.license_number = racingCar.license_number;

        RC_COUNT++;

    }
    public void start(){


    }

    public RacingCar(double trunkSize) {
        super(trunkSize);
            RC_COUNT++;
    }

    public RacingCar(String make, String model, double trunkSize) {
        super(make, model, trunkSize);
            RC_COUNT++;
    }

    public RacingCar(String model, double price, String make, double trunkSize) {
        super(model, price, make, trunkSize);
            RC_COUNT++;
    }

    public RacingCar(String license_number, String make, String model, double price, double trunkSize) {
        super(license_number, make, model, price, trunkSize);
            RC_COUNT++;
    }

    @Override
    public String toString() {
        return "RacingCar{}"+super.toString();
    }
}
