public class FindError{
public static void m1(int a,int b){
a=a*b;
  public int m1(int a,int b){
    a=a*b;
    return a;
}
  // Method must contain return 
public static void main(String[]args){
FindError f= new FindError();
  f.m1();
  FindError f = new FindError();
  int result = f.m1(4,7);
  System.out.println("product is "+result);
}
}
