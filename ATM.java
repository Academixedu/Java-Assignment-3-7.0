public class ATM{
  double Balance=30000;
  public double Balance(double deposit,double Withdrawl){
   double value=Balance+deposit;


    if(Balance<=Withdrawl){
     double val=Balance-Withdrawl;
  System.out.println("Balance is in "+val);
  }

    else{
    System.out.println("Balance in"+value);
    }
  return Balance;
  }

  public static void main(String[]args){
  ATM a=new ATM();
    a.Balance(3400,45000);
  }}
