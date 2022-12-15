/* write a java program to print using inheritance concept.*/
class Vehicle1{
  void run(){
    System.out.println("Vehicle is running");
  }
}
class Bike extends Vehicle1{
  void run(){
    System.out.println("Bike is running");
  }
}

class Vehicle{
  public static void main(String args[]){
    Bike b=new Bike();
    b.run();
  }
}