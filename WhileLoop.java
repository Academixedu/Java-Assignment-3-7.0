import java.util.Scanner;

public class WhileLoop{
  public static void main(String []args){
// Take Your Name in Scanner 
    // Using While Loop Print it for 5 times
    int count = 0;
    while(count <= 5){
      System.out.println("psvsai " + count);
      count++;


    } 
    Scanner scan = new Scanner(System.in);
    String name = scan.nextLine();
    System.out.println("Entered name is " + name);
  }
  }
