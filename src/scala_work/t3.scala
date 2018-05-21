package scala_work
object inter{
  def main(args: Array[String]): Unit = {
    var b = new Exam() with t1;
    b.display();
  }
}


trait t3 {
 def g();
 
}

trait t1 {
 def display(){
   println("T1....")
 }
}

class Exam extends t3 {  
  def g(){
   println("abs method....")
 }
}