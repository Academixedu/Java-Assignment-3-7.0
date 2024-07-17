import java.util.Scanner;

public class WhileLoop{


  public static void main(String []args){
// Take Your Name in Scanner 
    // Using While Loop Print it for 5 times 
    Scanner i = new Scanner(System.in);

    System.out.println("Enter your name:");
    String name = i.nextLine();
  
    int count = 0;
    while(count<5)
    {
      System.out.println(name);
      count++;

    }
  }
}

  
