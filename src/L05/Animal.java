package L05;

public  class Animal {
    public static int COUNT = 0;

    protected String name;
    protected String id;
    protected String type;
    private String test ="fff";

    public Animal(String name, String id, String type) {
        this.name = name;
        this.id = id;
        this.type = type;
        COUNT++;
    }

    public Animal(String name) {
        this.name = name;
        COUNT++;
    }

    public Animal(Animal other) {
        this.name = other.name;
        this.id = other.id;
        this.type = other.type;
        COUNT++;
    }

    public Animal(String id, String name) {
        this.id = id;
        this.name = name;
        COUNT++;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        //10x
        return this.name;
    }

    public void setName(String name) {
        if (name.length() < 2)
            return;

        this.name = name;
    }

    public final void func(){
        System.out.println("Hello func");
    }

    public static boolean compare(Animal animal1, Animal animal2) {

        return animal1.type.equals(animal2.type);

    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", type='" + type + '\'' +
                ", test='" + test + '\'' +
                '}';
    }


}


class Cat extends Animal {

    private int age;

    public Cat(String name, String id, String type, int age) {
        super(name, id, type);
        this.age = age;


    }
    //func()' cannot override 'func()' in 'L05.Animal'; overridden method is final
//    public void func(){
//        this.age=5;
//    }

//    @Override
//    public String toString() {
//        return "Cat{" +
//                "age=" + age +
//                '}' +super.toString();
//    }


    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", type='" + type + '\'' +
                '}';
    }


}


class Dog extends Animal {



    public Dog(String name, String id, String type) {
        super(name, id, type);
    }


}

//
//final class  A{
//
//}
////Cannot inherit from final 'L05.A'
//class B extends A{
//
//}
