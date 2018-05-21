package Function

object DefArugment {
 def main(args: Array[String]): Unit = {
   var obj = new Impl;
   println(obj.gradle());
   println(obj.gradle(100));
   
   var obj1 = new Impl2;
   println(obj1.gradle());
   println(obj1.gradle(100));
 }
}

class Impl{
  
  def gradle(a:Int=6,b:Int=6):Int={
    return a + b
  }
};

class Impl2 extends Impl {
  
 override def gradle(a:Int=6,b:Int=6):Int= a * b;

  
};