package L05;

import javax.swing.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("barak");
//        animal.name="d"; private
//        System.out.println(animal.name); private
        System.out.println(animal.getName());
        animal.setName("n");


        Animal animal1 = null;
        animal1= new Animal("barak");

        Animal[] animals = new Animal[10];

        Animal animal2 = new Animal("barak","123456789");
        animal2.getName();

        Animal animal3 = new Animal(animal1.getName(), animal.getId());
        Animal  animal4 = new Animal(animal1);

        Animal animal5 = new Animal("barak","123","h");
        Animal copyAnimal5 = new Animal(animal5);

        Animal.compare(animal5,copyAnimal5);


        System.out.println(animal);
        System.out.println(animal5);

        Cat cat = new Cat("cat-1","156","95",15);
        System.out.println(cat);



    }
}
