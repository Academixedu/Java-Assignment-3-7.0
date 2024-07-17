public class ATM{
  double Balance=30000;
  public double Balance(double deposit,double Withdrawl){
  Balance=Balance+deposit;

    if(Balance<=Withdrawl){
    Balance=Balance-Withdrawl;
  System.out.println("Balance is in "+" - "+ " value");
  }
    else{
    System.out.println("Balance in"+" + "+" Value");
    }
  return Balance;
  }
  public static void main(String[]args){
  ATM a=new ATM();
    a.Balance(3400,45000);
  }}
