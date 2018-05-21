package Function

object Anonymous {

  def main(args: Array[String]): Unit = {
    var sum = (x:Int) => x+1;
    var addNum = (a:Int,b:Int) => a+b;
    
    println(sum(1));
    println(addNum(10,20));
    
  }
}