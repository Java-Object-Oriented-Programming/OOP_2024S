package L02;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        s.name="Barak";
        s.setName("Barak");
        s.l_name="Sharabi";
        s.id="123456789";
        s.age="28";
        s.year="1995";

        Student s1=null;
        System.out.println(s1);
        System.out.println(s.getName());
        System.out.println(s.l_name);

        Student[] students = new Student[2];
        System.out.println(students[0]);
        System.out.println(students[1]);
        for (int i = 0; i < 2; i++) {
            students[i]=new Student();
            students[i].name= "name-"+i;
            students[i].l_name= "lname-"+i;
            students[i].id= "id-"+i;
            students[i].age= "age-"+i;
            students[i].year= "year-"+i;
        }

        for (int i = 0; i < 2; i++) {

            System.out.println( students[i].name);
            System.out.println( students[i].l_name);
            System.out.println( students[i].id);
            System.out.println( students[i].age);
            System.out.println( students[i].year);
        }

        System.out.println(students[0].toString());
        System.out.println(students[1]);


        Student s2 = new Student("Barak2","Sharabi2","123456789");

        System.out.println(s2);
    }
}
