package L03;

import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Person p = new Person("Barak");


        Person pTest = new Person();
        pTest.name = "Test";
        boolean bool = p.compare("barak");
        System.out.println(bool);
        bool = p.compare("barak1");
        System.out.println(bool);


        System.out.println(p.compare(pTest));


        System.out.println(pTest.compare(p));


        Person person = new Person("Barak", "Sharabi");
        Person person2 = new Person("Barak", 12);

        Scanner sc = new Scanner(System.in);
        int modeFunc;
        do {
            modeFunc = sc.nextInt();
            if (modeFunc == 1)
                p.compare("barak");
            else p.compare(pTest);

        } while (modeFunc != -1);


        Car bmw = new Car("Black",2024);
        Car bmw2 = new Car(bmw);


        Test t = new Test();
        t.func1();
        t.setName("najsb");

    }
}