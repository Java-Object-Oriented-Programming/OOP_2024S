package L06;

interface IMove {
    default void right() {
        System.out.println("right");
    }

    void left();
}

interface IFly extends IMove {
    void forward();

    void backward();
}

interface IC {

    double pi = 3.14;

    void ic();

    void ic1();

    void ic2();

    void ic3();

    void ic4();

    void ic5();

}

interface IA {


    double EXP = 1.7;

    void ia();

    void ia1();

    void ia2();

    void ia3();

    void ia4();

    void ia5();

}

public abstract class abstractClass {


    public abstract void func();

    public abstract void func1();

    public abstract void func2();

    public abstract void func3();

    public abstract void func4();

    public abstract void func5();

}

abstract class abstractClass2 {

    public abstract void gunc();

    public abstract void gunc1();

    public abstract void gunc2();

    public abstract void gunc3();

    public abstract void gunc4();

    public abstract void gunc5();

}

class G implements IC, IA, IMove {


    @Override
    public void ia() {

    }

    @Override
    public void ia1() {

    }

    @Override
    public void ia2() {

    }

    @Override
    public void ia3() {

    }

    @Override
    public void ia4() {

    }

    @Override
    public void ia5() {

    }

    @Override
    public void ic() {

    }

    @Override
    public void ic1() {

    }

    @Override
    public void ic2() {

    }

    @Override
    public void ic3() {

    }

    @Override
    public void ic4() {

    }

    @Override
    public void ic5() {

    }

    @Override
    public void left() {

    }


}
