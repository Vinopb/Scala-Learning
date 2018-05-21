package Function

object CurringFunction {
def main(args: Array[String]): Unit = {
  def add(a:Int)(b:Int):AnyVal = a+b;
  
  var onePlueFive =add(1)(5);
  println(onePlueFive);
  
  val addFour = add(1)_
  println(addFour);
  
   val twoPlusFour = addFour(2)
   println(twoPlusFour);
  
   val fln = addFour(5);
   println(fln);
  
}

}