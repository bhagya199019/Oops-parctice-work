/*animal class take some attaributes and extends one dog  we can print that.(single inheritance)*/

class Animal1{
  String color;
  int no_legs;
  String breed;
  void eat(){
    System.out.println("eating");
  }  
  void run(){
    System.out.println("running");
  }
}
class Dog extends Animal1{
  void bark(){
    System.out.println("Bow Bow......");
  }
  void display(){
    System.out.println(color +" "+no_legs+" "+breed);  
  }
}

class Animal{
  public static void main(String args[]){
    Dog puppy=new Dog();
    puppy.color="black";
    puppy.no_legs=4;
    puppy.breed="jarman shepherd";
    puppy.display();
    puppy.eat();
    puppy.run();
    puppy.bark();
  }
}