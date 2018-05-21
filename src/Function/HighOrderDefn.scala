package Function

object HighOrderDefn {
  
  def main(args: Array[String]): Unit = {
    var t = evulate(1,2,sum)
    var y = evulate(1,2,mul);
    
    
  }

val sum = (x:Int,y:Int)=> x+y;
val mul = (x:Int,y:Int) => x* y;
val Compar = (x:Int,y:Int) => if(x>y) x else  y;

def evulate(x:Int,y:Int,f:(Int,Int)=>Int){
  val result = f(x,y);
  println(result);
}

}
