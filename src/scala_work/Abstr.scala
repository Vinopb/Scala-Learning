package scala_work

object Abstr {
  def main(args: Array[String]): Unit = {
    val a = new Principal();
    a.hostel();
    a.trans();
    a.exam();
  }
}


abstract class College{
  def hostel()
  def trans()
  def exam(){
    println("non abstract")
  }
}


class Principal extends College{
   def hostel(){
      println("Principal Hostel")
   }
   def trans(){
      println("Principal trans")
   }
}

class Dean extends College{
   def hostel(){
      println("Dean Hostel")
   }
   def trans(){
      println("Dean trans")
   }
}