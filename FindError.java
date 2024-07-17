public class FindError{
public static int m1(int a,double b){
 a= (int)(a * b);
  return a;
}
  // Method must contain return 
public static void main(String[]args){
FindError f=new FindError();
  f.m1(2,3);
}
}
