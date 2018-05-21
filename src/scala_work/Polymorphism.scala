package scala_work

object Polymorphism {
  def main(args: Array[String]): Unit = {
    var l = new Load();
     l.over(100);
     l.over(100, "Vinod")
  }
 
}

class Load{
  def over(a:Int){
    println(a);
  }
  def over(a:Int,b:String){
    println(a +":" + b);
  }
}

