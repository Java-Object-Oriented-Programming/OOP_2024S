package L03;

public class Person {


    String name;
    String last_name;
    int age;

    public Person(String name,String last_name){
        this.name=name;
        this.last_name=last_name;
    }

    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    public Person(String name){
        this.name=name;
    }

    public Person(){}

    public boolean compare(String Name){

        return name.equals(Name);
    }

    public boolean compare(Person other){

        return this.name.equals(other.name);
//        return other.name.equals(this.name);
    }

//    public void compare(Person other){
//        return;
//    }

        public int compare(int other){
        return other;
    }
}
