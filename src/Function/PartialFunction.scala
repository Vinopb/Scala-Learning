package Function
import scala.io.StdIn;
object PartialFunction {
 def main(args: Array[String]): Unit = {
   
   def email(username:String,domain:String){
     println(username + domain)
   }
   
   var emailId = email(_:String,"@gmail.com");
   println(emailId);
   
   println("Enter user name")
   var line = StdIn.readLine()
   emailId(line);
 }    
}