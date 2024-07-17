import java.util.Scanner;
public class WhileLoop{
  public static void main(String []args){
// Take Your Name in Scanner 
Scanner sc=new Scanner(System.in);
System.out.println("enter your name");
String g=sc.next();
    // Using While Loop Print it for 5 times 
    int i=1;
    while(i<=5)
    {
    System.out.println("name="+g);
    i++;
    }
  }
}