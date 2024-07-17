public class FindError{
public int m1(int a,double b)
{

  return (int)(a*b);
}
  // Method must contain return 
public static void main(String[]args){
FindError f= new FindError();
int result = f.m1(10, 20);
System.out.println(result);

}
}
