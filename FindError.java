public class FindError{
public int  m1(int a,int b){
int c=a*b;
  return c;
}
  // Method must contain return 
public static void main(String[]args){
FindError f=new FindError();
  int d=f.m1(1,2);
  System.out.println(+d);
}
}
