import java.util.Scanner;

public class WhileLoop
{
  public static void main(String []args)
  {
// Take Your Name in Scanner 
    // Using While Loop Print it for 5 tim
     Scanner in=new Scanner(System.in);

     String Name=in.nextLine();
    int i=0;
     while(i<=5)
     {
      System.out.println(Name);
      i++;
     }

    


  }
}
