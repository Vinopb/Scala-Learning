package scala_work

object SingletonObject {
  
  def main(args: Array[String]): Unit = {
    Singleton.Hello();
  }

}

object Singleton{
  def Hello(){
    println("Hell,This is SingletonObject")
  }
}