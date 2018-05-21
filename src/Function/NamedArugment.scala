package Function

class NamedArugmentClass {
 def concat(a:Int,b:String){
  println("Method " + a + " " + b);
  println(s"Method $a $b");
 }
}

class NamedArugmentClass2 extends NamedArugmentClass{
 override def concat(a:Int,b:String){
  //println("Method " + a + " " + b);
  println(s"Method $a $b");
 }
}

object NamedArugmentObject{
  def main(args: Array[String]): Unit = {
    var g = new NamedArugmentClass2;
     g.concat(10,"Vinod");
     g.concat(b="Vinod",a=1);
    
  }
}