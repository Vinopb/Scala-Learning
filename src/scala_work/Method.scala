/**
 *
 */
package scala_work

/**
 * @author vinodpc
 *
 */
object Method {
 def display(){
   println("Method with no Arugments")
 }
 
 def demo(a:Int,b:String){
    println("Method with  Arugments:" + a +":" + b);
 }
 
 
 def returnDemo():Int = {
   return 100;
 }
 
 def addInt(a: Int, b :Int): Int = {
   var sum : Int = 0;
   sum = a + b;
   sum;
 }
 
 def sumbInt(a: Int, b :Int): Int = {
   var sum : Int = 0;
   a -  b; 
 }
  
 def main(args:Array[String]){
   display();
   demo(100,"Vinod");
   println(returnDemo());
   println("The result is " + addInt(2,1));
   println("The result is " + sumbInt(2,1));
   val s = new sample();
   s.a =100;
   s.b= 20;
   s.sum();
 }
}

class sample{
  var a:Int = 0;
  var b:Int = 0; 
  def sum(){
    println(a+b);
  }
}