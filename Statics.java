public class Statics{
// Create a Static method with return type String
 public static String name(String name){
     return name;
 }
  public static void main(String[]args){
    //Call the Method and Print the value of return type in output
    name("Swarupa");
    System.out.println("name is "+name("Swarupa"));
  }
}
