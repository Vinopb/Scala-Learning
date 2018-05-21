package scala_work

object OverRide {
def main(args: Array[String]): Unit = {
   var r = new Ride();
   r.app();
}
  
}

class Over {
  def app(){
    println("Marshmellow");
  }
}

class Ride extends Over{
   override def app(){
    println("Orea");
  }
}