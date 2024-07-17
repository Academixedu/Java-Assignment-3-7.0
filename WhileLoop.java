import java.util.Scanner;
public class WhileLoop{
  public static void main(String []args){
// Take Your Name in Scanner 
    // Using While Loop Print it for 5 times 
    Scanner sh = new Scanner(System.in);
    System.out.println("Enter Your Name");
    String name =sh.nextLine();


    int count = 0 ;
    while (count < 5)
    { 
    System.out.println(name +count);
    count ++;
    }

  }
}
