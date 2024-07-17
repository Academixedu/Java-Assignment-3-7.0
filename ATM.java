public class ATM{
  double Balance=30000;
  public double Balance(double deposit,double Withdrawl){
  double B=Withdrawl+deposit;
    if(B>=Withdrawl){
    double C=Balance-Withdrawl;
  System.out.println("Balance is in "+C);
  }
    else{
    System.out.println("Balance in"+B);
    }
  return B;
  }
  public static void main(String[]args){
  ATM a=new ATM();
    a.Balance(3400,45000);
  }}
