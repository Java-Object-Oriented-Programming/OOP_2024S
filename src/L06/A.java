package L06;

 public abstract class A {

   public abstract void  abstractFunc();

   public static void f(){
       System.out.println("f from A");
   }
    public static void g(){
        System.out.println("g from A");
    }


}

abstract class B extends A{
    public static void f(){
        System.out.println("f from B");
    }
}
abstract class C extends B{

}

class D extends C{
    public  void  abstractFunc(){

    }

}
//
// final class E{
//
//
//}
//
//class F extends E{
//
//
//}
