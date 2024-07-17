public class Statics{
// Create a Static method with return type String
public static String name(String n ){
  return n;
}
 
  public static void main(String[]args){
  Statics ob=new Statics( );
  String res=ob.name("sankeerthana");
  System.out.println("name is "+res);
      //Call the Method and Print the value of return type in output
    
  }
}
