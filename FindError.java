public class FindError{
public int m1(int a,int b){
  a=a * b;
  return a;
}

public static void main(String[]args){
FindError f=new FindError();
int result=f.m1(2, 3);
System.out.println("product"+result);
}
}
