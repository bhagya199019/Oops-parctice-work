/*create bank class print same methods in two classes method name is rateofinterest print those two bank classes.*/
class RateOfInt{
  public static void main(String args[]){
    HDFC hdfc=new HDFC();
    SBI s=new SBI();
    hdfc.rateOfInterest();
    s.rateOfInterest();
  }
}
class Bank{
  void rateOfInterest(){
    System.out.println("Interest is 80ps");
  }
}
class SBI extends Bank{
   void rateOfInterest(){
    System.out.println("Interest is 60ps");
  }
}
class HDFC extends Bank{
   void rateOfInterest(){
    System.out.println("Interest is 70ps");
  }
}
