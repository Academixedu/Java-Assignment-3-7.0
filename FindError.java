public class FindError{
public static  int  m1(int a,double b){
a=(int)(a*b);
return a;
}
public static void main(String[]args){
FindError f=new FindError();
  System.out.println(f.m1(5,2.5));
}
}
