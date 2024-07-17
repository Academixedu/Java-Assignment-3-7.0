public class FindError{
public  int  m1(int a,int b){
int c = a*b;
  return c;
}
  // Method must contain return 
public static void main(String[]args){
FindError f=new FindError();
  f.m1(1,2);
  System.out.println("t is"+f.m1(1, 2));
}
}
