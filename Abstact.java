import java.util.*;
abstract class Student{
  int id;
  String name;
 
  public void read(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter id");
    id=sc.nextInt();
    System.out.println("Enter name");
    name=sc.next();  
  }
  public void display(){
    System.out.println(id+ " "+name);
    
  }
  abstract void grade();
}
class Student1 extends Student{
 
  public void grade(){
     Scanner sc=new Scanner(System.in);
    System.out.println("enter the marks");
    int marks=sc.nextInt();
    if(marks>90){
      System.out.println("GRADE A");
    }
    else if(marks>80 && marks<90){
      
     System.out.println("GRADE B");
    }
    else{
      System.out.println("fail");
    }
  }
}
class Abstact{
  public static void main(String args[]){
    Student std=new Student1();
    std.read();
    std.display();
    std.grade();
  }
}