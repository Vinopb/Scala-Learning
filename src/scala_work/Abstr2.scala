package scala_work

object Abstr2 {
 def main(args: Array[String]): Unit = {
    var b = new Sample();
    b.a();
    b.b();
  }
}

abstract class ab{
  def a()
}

trait t2 {
  def b()
}

class Sample extends ab with t2{
  def a(){
    println("Abstract Method")
  }
  
  def b(){
    println("trait Method")
  }
}
