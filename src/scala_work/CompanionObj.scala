package scala_work

object CompanionObj {
  def main(args: Array[String]): Unit = {
    var h = new Hello();    
  }

}

object Hello{
  private val DefaultMessage : String = "Hello";
}

class Hello (message : String = Hello.DefaultMessage){
  println(message);
};