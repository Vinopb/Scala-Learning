package scala_work

object underscore {
  def main(args: Array[String]): Unit = {
    val numbers = Array(1,2,3,4,5);
    
    val sum = numbers.reduceLeft[Int](_+_);
    println(sum);
  }
}