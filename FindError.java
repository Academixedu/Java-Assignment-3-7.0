public class FindError{
public static int  m1(int a,int b){
a=a*b;
  return a;
}
  // Method must contain return 
public static void main(String[]args){
FindError f= new FindError();
  int result=f.m1(10, 5);
  System.out.println("product is:"+result);
}
}
