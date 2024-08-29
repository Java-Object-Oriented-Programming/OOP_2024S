package L04;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println(A.cnt);

        A a = new A();
        a.packageFunc();
        a.protectedFunc();
        a.publicFunc();
//        a.privateFunc(); Error
        System.out.println(A.cnt);



        A a1 = new A();
        a1.publicFunc();
        System.out.println(A.cnt);

        a.equals(a1);


        A[] arr = new A[10];

        System.out.println(A.cnt);

        for (int i = 0; i < 10; i++) {
            arr[i]= new A();
            System.out.println(A.cnt);
        }


        Object obj = new A();
        Object obj2 = new ArrayList<>();

        a.toString();

        System.out.println(a);

        Object[] objects = {0,1.5,new A(),new ArrayList<>(),null,new int[][][][][][][][][][]{}};

        A aTest = new A();
        Object objTest = new A();




    }
}
