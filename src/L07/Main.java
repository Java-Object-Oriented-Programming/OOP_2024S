package L07;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        int num = 0, num1 = 0;

        int div;
//        div = num / num1;
        try {
            div = num / num1;

        } catch (ArithmeticException e) {


        } catch (IndexOutOfBoundsException e) {

        } catch (Exception e) {

            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println("Err");


        } finally {
            System.out.println("Done try/catch");
        }

//        catch2(new Exception("error"));

        System.out.println("Done");
//        divByZero(0, 0);

        try {

            get(new int[]{1, 2, 3, 1, 2, 3}, 0);
        } catch (IndexOutOfBoundsException e) {

        } catch (IllegalAccessException e) {

        } catch (NotSEXC e) {
            System.out.println(e.getMessage());
            e.ppprint();
        }

        try {

            get(new int[]{1, 2, 3, 1, 2, 3}, 0);
        } catch (IndexOutOfBoundsException | IllegalAccessException | NullPointerException e) {

        } catch (NotSEXC e) {
            System.out.println(e.getMessage());
            e.ppprint();
        }
        Room r = null;
        try {
            r = new Room("livingroom", 5, 6);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(r);


    }

    public static void catch2(Exception e) {


    }

    public static int divByZero(int num1, int num2) throws Exception {
//        try {
//
//            return num1 / num2;
//        } catch (Exception e) {
//
//            return 0;
//        }

        return num1 / num2;

    }

    public static int get(int[] arr, int index) throws IndexOutOfBoundsException, IllegalAccessException, NullPointerException, NotSEXC {
        if (arr == null)
            throw new NullPointerException("Null");
        if (index < 0)
            throw new IndexOutOfBoundsException("Invalid argument");
        if (index > arr.length)
            throw new IllegalArgumentException("Error");
        if (index == 5)
            throw new NotSEXC();

        return arr[index];

    }
}
