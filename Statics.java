public class Statics{

public String name(String n)
{
  return n;
}
 
  public static void main(String[]args){
    Statics s=new Statics();
    String result=s.name("preetham");
    System.out.println("My name "+result);
    
  }
}
