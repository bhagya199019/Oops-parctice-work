import java.util.Scanner;
class Product{
  public static void main(String args[]){
    Prod p[]=new Prod[2];
    Scanner s=new Scanner(System.in);
    for(int i=0;i<2;i++){
      System.out.println("enter the product details:");
      p[i]=new Prod();
      p[i].setPid(s.nextInt());
      p[i].setPname(s.next());
      p[i].setPqty(s.nextInt());
      p[i].setPrice(s.nextInt());
      System.out.println(p[i].getPid()+","+p[i].getPname()+","+p[i].getPqty()+","+p[i].getPrice());
      
    }
  }
}
 class Prod{
  private int pid;
  private String pname;
  private int pqty;
  private int price;
  void setPid(int pid){
    this.pid=pid;
  }
  void setPname(String pname){
    this.pname=pname;
  }
  void setPqty(int pqty){
    this.pqty=pqty;
  }
  void setPrice(int price){
    this.price=price;
  }
  int getPid(){
   return this.pid;
  }
  String getPname(){
    return this.pname;
  }
  int getPqty(){
    return this.pqty;
  }
  int getPrice(){
    return this.price;
  }
  }
