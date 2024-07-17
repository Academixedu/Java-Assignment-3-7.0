public class Statics{
  public static String name(String n){
    return n;
  }
// Create a Static method with return type String
 
  public static void main(String[]args){
    //Call the Method and Print the value of return type in output
    Statics sd=new Statics();
    String s=sd.name("sai");
    System.out.println("my name is: "+s);
  }
}
