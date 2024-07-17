public class Statics{
// Create a Static method with return type String
public static String str(String name){
  return name;
}
 
  public static void main(String[]args){
    //Call the Method and Print the value of return type in output
    Statics s=new Statics();
    String sc=s.str("goutham");
    System.out.println("name is "+sc);
    
  }
}
