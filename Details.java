/*Create a class named 'Member' having the following members:
Data members
1 - Name
2 - Age
3 - Phone number
4 - Address
5 - Salary
It also has a method named 'printSalary' which prints the salary of the members.
Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' and 'Manager' classes have data members 'specialization' and 'department' respectively. Now, assign name, age, phone number, address and salary to an employee and a manager by making an object of both of these classes and print the same.*/
class Member{
  String name;
  int age;
  long phone_number;
  String address;
  int salary;
  void printSalary(){
    System.out.println("print slary:"+salary);
  }
  }
class Employee extends Member{
  String specialization;
  String department;
  
}
class Manager extends Member{
  String specialization;
  String department;
}
class Details{
  public static void main(String args[]){
    Employee emp=new Employee();
    emp.name="Bhagya";
    emp.age=30;
    emp.phone_number=9849417735l;
    emp.address="N.G.OColony,kadapa(dt),Andhra Pradesh";
    emp.salary=35000;
    emp.specialization="M.tech";
    emp.department="Developer";
   
    System.out.println(emp.name+" "+emp.age+" "+emp.phone_number+" "+emp.address+" "+emp.salary+" "+emp.specialization+" "+emp.department);
     emp.printSalary();
    Manager ma=new Manager();
    ma.name="Ram";
    ma.age=38;
    ma.phone_number=9742717765l;
    ma.address="Indraprastha villa,manikonda,Telangana";
    ma.salary=40000;
    ma.specialization="M.tech";
    ma.department="Senior developer";
     System.out.println(ma.name+" "+ma.age+" "+ma.phone_number+" "+ma.address+" "+ma.salary+" "+ma.specialization+" "+ma.department);
    ma.printSalary();
    
  }
}