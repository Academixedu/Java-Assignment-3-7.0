import java.util.Scanner;
public class WhileLoop{
  public static void main(String []args){ 
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter your Name: ");
    String name=sc.nextLine();
    int i=0;
    while(i<5){
      System.out.println(name+" "+i);
      i++;
    }
  }
}
