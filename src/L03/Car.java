package L03;

public class Car {

    protected String color;
    int price;
    int year;
    Engine en;


    public Car(String color, int year) {
        this.color = color;
        this.year = year;
    }

    public Car(Car other) {
        this.color = other.color;
        this.year = other.year;
    }
}
