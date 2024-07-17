public class FindError{

  // Method must contain return 
public static void main(String[]args){
FindError f=new FindError();
  f.m1(2, 9);
  System.out.println("return value is " + f.m1(2, 9));
}
public int  m1(int a,int b){
  a=a*b;
    return a;
  }
}
