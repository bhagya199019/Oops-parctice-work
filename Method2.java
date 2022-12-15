class Method2{
  public static void main(String args[]){
    PrintNumber.print(1);
      PrintNumber.print(2.3f);
     PrintNumber.print(4.5d);
    PrintNumber.print(86455789);
  }
}

class PrintNumber{
 
       public  static void print(int a){
         System.out.println((a));
       }
      public  static void print(float a){
         System.out.println((a));
       }
       public  static void print(double a){
         System.out.println((a));
       }
           public  static void decimal(long a){
         System.out.println((a));
       }
}
       
          
