public class Statics{
// Create a Static method with return type String
 public String name(String n)
 {
    return n;
 }
  public static void main(String[]args){
    //Call the Method and Print the value of return type in output
    Statics s=new Statics();
    String result=s.name("MANI");
    System.out.println("MY NAME IS "+result);
  }
  
  
}
