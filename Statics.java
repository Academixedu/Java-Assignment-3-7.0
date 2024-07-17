public class Statics{
// Create a Static method with return type String
 public static String name(String a){
  return a;
 }
  public static void main(String[]args){
    Statics b = new Statics();
    b.name("fayaz");
    System.out.println("name is :" +name("fayaz"));
    //Call the Method and Print the value of return type in output
    
  }
}
