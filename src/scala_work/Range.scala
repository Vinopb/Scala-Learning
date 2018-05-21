package scala_work
import Array.range

object Range {
  def main(args: Array[String]): Unit = {
    var t = new Ranger();
    t.show();
  }
}

class Ranger{
   def show(){
     var a= range(1,10,2);
     var b = range(1,10);
     println(a);
     for(d <- a){
        println(d)
     }
       
     println(b)
      for(e <- b){
        println(e)
     }
   }
}