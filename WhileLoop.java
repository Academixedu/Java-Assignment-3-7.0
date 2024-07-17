import java.util.Scanner;

public class WhileLoop{
  public static void main(String[] args){
// Take Your Name in Scanner 
System.out.println("enter the name");
Scanner sc = new Scanner(System.in);
String name = sc.nextLine();

    // Using While Loop Print it for 5 times 
   int count=0;
   while(count<5){
    System.out.println("name is "+ name);
    count++;
   }
  }
}
