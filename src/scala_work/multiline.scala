package scala_work

object multiline {
  
  def main(args: Array[String]): Unit = {
    var result3 =  add2(10,10);
    println(result3);
  }
  
  def add2(a:Int, b:Int) = {
    a +
    b
  }
}