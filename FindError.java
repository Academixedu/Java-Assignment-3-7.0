public class FindError{
public static double m1(double a,double b){
a=(double) (a*b);
  return a;
}
  // Method must contain return 
public static void main(String[]args)
{
FindError  f=new FindError();
  double d=f.m1(3, 3);
  System.out.println("product is "+d);
}
}

