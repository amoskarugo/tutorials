package OOP.Abstraction.interfaces.ExtendDemo.ExtendDemo2;

public interface A {
   default void fun() {
       System.out.println("hello");
   };
   // static methods in an interface should always have a body.
    //call via the interface
   static void run(){
       System.out.println("run");
   }
}
