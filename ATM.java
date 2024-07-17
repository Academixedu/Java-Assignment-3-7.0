public class ATM{
  double Balance=30000;
  public double Balance(double deposit,double withdrawl)
  {
  Balance=Balance+deposit;
    if(Balance<=withdrawl)
    {
     double bal=Balance-withdrawl;
  System.out.println("Balance is in "+bal);
  }
    else{
    System.out.println("Balance is greater then withdraw");
    }
  return Balance;
  }
  public static void main(String[]args){
  ATM a=new ATM();
    a.Balance(3400,45000);
  }}
