package L06;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Vehicle v = new Car("AY3000",300000.00,"Bugatti",10);

        System.out.println(v.getClass());

        if(v instanceof Vehicle && v.getClass().equals(Car.class))
            System.out.println("V");

        if(v instanceof Vehicle && v instanceof Car)
            System.out.println("V");
        else if (v instanceof Car)
            System.out.println("C");


        Vehicle v1 = new Car("AY3000",300000.00,"Bugatti",10);

        A.f();
        B.f();
        A.g();
        B.g();

        IMove cM = new Car("AY3000",300000.00,"Bugatti",10);
        IMove bM = new Bus("AY3000",300000.00,"Bugatti",10);
        IMove mM = new MotorCycle("AY3000","300000.00","Bugatti",10);

        cM.left();
        bM.left();
        mM.left();

        if(cM instanceof Car)
        {
            ((Car) cM).getTrunkSize();
        }
//        ((Bus) cM).getDriver_cost();

        getLeft(v);
        getLeft(v1);
        getLeft(cM);
        getLeft(bM);
        getLeft(mM);


        ArrayList<Integer> al = new ArrayList<>(){{
            for (int i = 0; i < 10; i++) {
                add(i);
            }
        }};

        LinkedList<Integer> ll = new LinkedList<>(){{
            for (int i = 11; i < 22; i++) {
                add(i);
            }
        }};
        System.out.println(sum(al));
        System.out.println(sum(ll));

    }

    public static void getLeft(IMove v){

        v.left();
    }
    public static int sum(List<Integer> l){

        int sum=0;
        for (int i = 0; i < l.size(); i++) {
            sum+=l.get(i);
        }

        return sum;
    }
}
