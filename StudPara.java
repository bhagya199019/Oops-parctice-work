/* write a program student class id,name,marks,grade and branch using paramterized constrctor*/
class Student{
  int sid;
  String sname;
  int smarks;
  char sgrade;
  String sbranch;
  Student(){
    sid=123;
    sname="Bhagi";
    smarks=520;
    sgrade='A';
    sbranch="ECE";
  } 
  Student(int id,String name,int marks,char grade,String branch){
    sid=id;
    sname=name;
    smarks=marks;
    sgrade=grade;
    sbranch=branch;
  }
  Student(int sid,int smarks){
    this.sid=sid;
    this.smarks=smarks;
  }
  }


class StudPara{
  public static void main(String args[]){
    Student s=new Student();
    System.out.println(s.sid);
    System.out.println(s.sname);
    System.out.println(s.smarks);
    System.out.println(s.sgrade);
    System.out.println(s.sbranch);
    Student s1=new Student(2558,"sree",480,'B',"ECE");
    System.out.println(s1.sid+" "+s1.sname+" "+s1.smarks+" "+s1.sgrade+" "+s1.sbranch);
    Student s2=new Student(465,550);
    System.out.println(s2.sid+" "+s2.smarks);
    
    
  }
       
  }