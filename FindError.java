public class FindError{
  public int  m1(int a,int b){
 int c=a*b;
    return c;
  }
    // Method must contain return 
  public static void main(String[]args){
  FindError f= new FindError();
    int c =f.m1(9,7);
    System.out.println("product "+ c);

  }
  }
