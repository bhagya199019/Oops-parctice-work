interface Calculator{
  public void add();
  public void sub();
  public void mul();
  public void div();
}
class Cal implements Calculator{
  public void add(){
    System.out.println("addition is "+(2+3));
  }
  public void sub(){
     System.out.println("addition is "+(2-3));
  }
  public void mul(){
    System.out.println("multiplication is"+(2*3));
  }
  public void div(){
    System.out.println("division is "+(3/2));
  }
}
class Intface{
  public static void main(String args[]){
    Calculator c=new Cal();
    c.add();
    c.sub();
    c.mul();
    c.div();
  }
}