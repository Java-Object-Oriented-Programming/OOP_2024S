package L04;

import java.util.ArrayList;

public class A {

    public static int cnt = 0;
    public int price = 100;

    public static void inc() {
        cnt++;
    }

    public int max(int a, int b) {
        return (a < b) ? b : a;
    }

    public A(int a) {
        inc();
    }

    public A() {
        cnt++;
    }

    public int max(float a, float b) {

        return (a < b) ? (int) b : (int) a;
    }

    public double max(double a, double b) {
        return (a < b) ? b : a;
    }

    private void privateFunc() {
    }

    public void publicFunc() {
        System.out.println(this.toString());
        System.out.println(price);
    }

    protected void protectedFunc() {
    }

    void packageFunc() {
    }

//    private double max(double a, double b) {
//        return (a < b) ? (float)b : (float)a;
//    }


    @Override
    public boolean equals(Object obj) {
        if(obj instanceof A){
           return price==((A) obj).price;
        }
        return false;
    }
    public boolean equals(A other) {

        return price== other.price;
    }

    @Override
    public String toString() {
        return "A{" +
                "price=" + price +
                '}';
    }
}

class Main1 {


    public static void main(String[] args) {
        A a = new A();
//        a.privateFunc()
    }
}