import java.util.Scanner;
class Customer{
  public static void main(String args[]){
    Cust p[]=new Cust[2];
    Scanner s=new Scanner(System.in);
    for(int i=0;i<2;i++){
      System.out.println("enter the customer details:");
      p[i]=new Cust();
      p[i].setCid(s.nextInt());
      p[i].setCname(s.next());
      p[i].setCadres(s.next());
      p[i].setCmobno(s.nextLong());
      System.out.println(p[i].getCid()+","+p[i].getCname()+","+p[i].getCadres()+","+p[i].getCmobno());
      
    }
  }
}
 class Cust{
  private int cid;
  private String cname;
  private String cadres;
  private long cmobno;
  void setCid(int cid){
    this.cid=cid;
  }
  void setCname(String cname){
    this.cname=cname;
  }
  void setCadres(String cadres){
    this.cadres=cadres;
  }
  void setCmobno(long cmobno){
    this.cmobno=cmobno;
  }
  int getCid(){
   return this.cid;
  }
  String getCname(){
    return this.cname;
  }
  String getCadres(){
    return this.cadres;
  }
  long getCmobno(){
    return this.cmobno;
  }
  }
