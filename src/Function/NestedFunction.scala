package Function

object NestedFunction {
 def main(args: Array[String]): Unit = {
   val d  = new Facto();
   println(d.max(100,2,3))
 }
}

class Facto{
  def max(a:Int,b:Int,c:Int)= {
    def maxx(x:Int,y:Int) = if(x>y) x else y
   
   maxx(a,maxx(b,c));
  }
}