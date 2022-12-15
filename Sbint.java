import java.util.Scanner;
interface Atm{
  public void Deposit();
  public void GetBalance();
  public void WithDraw();
  public void DisplayMenu();
}
class Sbi implements Atm{
int bal=10000;
  Scanner s=new Scanner(System.in);
   public void Deposit() {
       System.out.println("Enter deposite amount");
       int amt=s.nextInt();
       if(amt%100==0) {
           if(amt<=20000) {
            bal=bal+amt;
            
            
            System.out.println("Avaible bal is: "+bal);
            }
           else {
               System.out.println("deposite limit is 20000 only");
               }
       }
       else {
           System.out.println("Please enter multiples of 100");
       }
       
    }

 public void WithDraw() {
        System.out.println("Enter withdraw amount");
        int amt=s.nextInt();
    
          if(amt%100==0){
            if(amt<=20000) {
                 if(amt<=(bal-500)) {
                 bal=bal-amt;
                
              
               System.out.println("Avaible bal is: "+bal);
              }
              else {
               System.out.println("insufficient fund");          
              }
            }
            else {
                System.out.println("Withdraw amount limit is 20000 only");
            }
        }
          else{
            System.out.println("please enter multiples of 100 only");
          }
 }
 
  public void GetBalance(){
        System.out.println(bal);
    }
  
public void DisplayMenu(){
        int option=0;
        do {
        System.out.println("1. Deposite");
        System.out.println("2. Withdraw");
        System.out.println("3. GetBalance");
        System.out.println("0. EXIT");
        System.out.println("Choose your option");
        option=s.nextInt();
        if(option==1) {
            Deposit();
        }
        else if(option==2) {
           WithDraw();
        }
        
        else if(option==3) {
            GetBalance();
        }
        else if(option==0) {
            System.out.println("Thank you, visit again");
        }
        }
        while(option!=0);
    }
}

       class Sbint{
            public static void main(String[] args) {
    
        Atm obj=new Sbi();
    obj.DisplayMenu();
    }

} 
        
        