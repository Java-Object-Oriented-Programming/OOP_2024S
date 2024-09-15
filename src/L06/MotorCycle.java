package L06;

public class MotorCycle extends Vehicle implements IMove{

    private static int MC_COUNT = 0;

    public MotorCycle(MotorCycle mc){
        this.license_number = mc.license_number;
        this.make = mc.make;
        this.model = mc.model;
        this.price = mc.price;
        MC_COUNT++;

    }
    public MotorCycle() {
         MC_COUNT++;
    }

    public MotorCycle(String make, String model) {
        super(make, model);
         MC_COUNT++;
    }

    public MotorCycle(String model, double price, String make) {
        super(model, price, make);
         MC_COUNT++;
    }

    public MotorCycle(String license_number, String make, String model, double price) {
        super(license_number, make, model, price);
         MC_COUNT++;
    }

    @Override
    public void start() {
        System.out.println("start frm Motor");
    }

    @Override
    public void left() {
        System.out.println("Motor left");
    }
}
