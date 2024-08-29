package L03;

public class Test {

    private int num1;
    final int num2;
    private String name;

    public Test() {
        this.num2=9;
    }

    public Test(int num2) {
        this.num2 = num2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.equals("") || name.length()<2)
            return;
        this.name = name;
    }

    void func1(){
        this.num1=8;
    }

    void func2(){

    }
}
