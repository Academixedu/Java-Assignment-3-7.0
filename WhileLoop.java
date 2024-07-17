import java.util.Scanner;

public class WhileLoop{
  public static void main(String []args){
// Take Your Name in Scanner 
    // Using While Loop Print it for 5 times 
    Scanner sc=new Scanner(System.in);
    System.out.println("enter institute name");
    String sname=sc.nextLine();
  int i=0;
  while(i<=5){
    System.out.println("INSTITUTE NAME:"+sname);
    i++;
  }
}
}
