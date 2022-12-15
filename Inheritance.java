/* class A{
      public void m1() {
          System.out.println("m1 of class A");
      }
}

public class Inheritance extends A {

    public static void main(String[] args) {
    
           Inheritance obj=new Inheritance();
           obj.m1();
    }

}*/
class A{
      public void m3() {
          System.out.println("m3 of class A");
      }
}

  class B extends A{
      public void m2() {
          System.out.println("m2 of class B");
      }
}

public class Inheritance extends B {

    public void m1() {
        System.out.println("m1 of class Example3");
    }
    public static void main(String[] args) {
    
           Inheritance obj= new Inheritance();
           obj.m1();
           
      obj.m3();
      obj.m2();
    }

} 