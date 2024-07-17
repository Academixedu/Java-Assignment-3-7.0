public class ATM{
  double Balance=30000;
  public double Balance(double deposit,double Withdrawl){
  Balance=Balance+deposit
    if(Balance<=withdrawl){
    Balance=Balance-withdrawl;
  System.out.println("Balance is in "+' + '+ " value");
    Balance=Balance+deposit;
  }
    if (Balance>=Withdrawl)
    {
      Balance =Balance-Withdrawl;
      System.out.println("Balance in "+" + "+" value ");
    }
    else{
    System.out.println("Balance in"+" - "+" Value");
    }
