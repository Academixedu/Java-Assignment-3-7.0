public class FindError{
public int m1(int a,int b)
{
int c=a*b;
  return c ;
}
  // Method must contain return 
public static void main(String[]args)
 {
FindError f=new FindError();
  int product=f.m1(5,6);
  System.out.println("Product is "+ product);

  }
}
