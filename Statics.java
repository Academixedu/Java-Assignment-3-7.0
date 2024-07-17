public class Statics{
// Create a Static method with return type String
 public static String name(String name1){
return name1;
 }
  public static void main(String[]args){
    //Call the Method and Print the value of return type in output
    Statics b=new Statics();
    String res=b.name("syam");
    System.out.println(res);
    
  }
}
