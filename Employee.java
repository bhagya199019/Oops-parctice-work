import java.util.Scanner;
class Employee{
  public static void main(String args[]){
    Emp p[]=new Emp[2];
    Scanner s=new Scanner(System.in);
    for(int i=0;i<2;i++){
      System.out.println("enter the employee details:");
      p[i]=new Emp();
      p[i].setEid(s.nextInt());
      p[i].setEname(s.next());
      p[i].setEsal(s.nextInt());
      p[i].setEmobno(s.nextLong());
      System.out.println(p[i].getEid()+","+p[i].getEname()+","+p[i].getEsal()+","+p[i].getEmobno());
      
    }
  }
}
 class Emp{
  private int eid;
  private String ename;
  private int esal;
  private long emobno;
  void setEid(int eid){
    this.eid=eid;
  }
  void setEname(String ename){
    this.ename=ename;
  }
  void setEsal(int esal){
    this.esal=esal;
  }
  void setEmobno(long emobno){
    this.emobno=emobno;
  }
  int getEid(){
   return this.eid;
  }
  String getEname(){
    return this.ename;
  }
  int getEsal(){
    return this.esal;
  }
  long getEmobno(){
    return this.emobno;
  }
  }
