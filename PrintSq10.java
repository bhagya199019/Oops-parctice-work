/*Create a class named 'Rectangle' with two data members 'length' and 'breadth' and two methods to print the area and 
perimeter of the rectangle respectively. Its constructor having parameters for length and breadth is used to initialize
 length and breadth of the rectangle. Let class 'Square' inherit the 'Rectangle' class Print the area and perimeter of 
a rectangle and a square.
Now repeat the above example to print the area of 10 squares.
Hint-Use array of objects*/

import java.util.*;
class Rectangle1{
  int length;
  int breadth;
  Rectangle1(int l,int b){//(s,s)
    length=l;//s
    breadth=b;//s
  }
  void area(){
    int area=length*breadth;//s*s
    System.out.println("area of rectangle:"+area);
    
  }
  void perimeter(){
    int peri=(2*length)+(2*breadth);//(2*s)+(2*s)
    System.out.println("perimeter of rectangle:"+peri);
  }
}
class Square1 extends Rectangle1{
  Square1(int s){
    super(s,s);
  }
}
class PrintSq10{
  public static void main(String args[]){
    int side;
    Rectangle1 r=new Rectangle1(10,20);
    Square1 s[]=new Square1[10];
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<10;i++){
      System.out.println("enter square"+(i+1)+" details");
      side=sc.nextInt();
      s[i]=new Square1(side);
       s[i].area();
    s[i].perimeter();
    }
    r.area();
    r.perimeter();
    
  }
}