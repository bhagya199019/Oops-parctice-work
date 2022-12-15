import java.util.Scanner;
class Student{
  public static void main(String args[]){
    Stu p[]=new Stu[2];
    Scanner s=new Scanner(System.in);
    for(int i=0;i<2;i++){
      System.out.println("enter the student details:");
      p[i]=new Stu();
      p[i].setSid(s.nextInt());
      p[i].setSname(s.next());
      p[i].setSmarks(s.nextInt());
      p[i].setSmobno(s.nextLong());
      System.out.println(p[i].getSid()+","+p[i].getSname()+","+p[i].getSmarks()+","+p[i].getSmobno());
      
    }
  }
}
 class Stu{
  private int sid;
  private String sname;
  private int smarks;
  private long smobno;
  void setSid(int sid){
    this.sid=sid;
  }
  void setSname(String sname){
    this.sname=sname;
  }
  void setSmarks(int smarks){
    this.smarks=smarks;
  }
  void setSmobno(long smobno){
    this.smobno=smobno;
  }
  int getSid(){
   return this.sid;
  }
  String getSname(){
    return this.sname;
  }
  int getSmarks(){
    return this.smarks;
  }
  long getSmobno(){
    return this.smobno;
  }
  }
