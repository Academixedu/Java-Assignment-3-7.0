public class FindError{
public int m1(int a,int  b){
a = a*b;
  return a;
}
  // Method must contain return 
public static void main(String[]args){
FindError f= new FindError();
  int myresult=f.m1(5,3);
  System.out.println("result is "+myresult);
}
}
