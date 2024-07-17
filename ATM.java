public class ATM{
  double Balance=30000;
  public double Balance(double deposit,double Withdrawl){
  double value=Withdrawl+deposit;
    if(value<=Withdrawl){
    double Balance=Withdrawl-value;
  System.out.println("Balance is in "+Balance);
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
