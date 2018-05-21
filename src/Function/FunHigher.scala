package Function

object FunHigher {
  
  def main(args: Array[String]): Unit = {
    var t = processRange(1,2,halfMaker)
    var t1 = processRange(1,2,addFive)
  }
  
  def halfMaker(value:Int):Double = value.toDouble/2;
  def addFive(value:Int):Int = value + 5;
  def processRange(start:Int,finish:Int,processor:Int=>AnyVal):Unit = {
    for(i<- start to finish){
      println(processor(i))
    }
  }

}