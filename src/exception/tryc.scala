package exception
import java.io.FileNotFoundException
import java.io.IOException

object try2  {
def main(args: Array[String]): Unit = {
var d=new FinallyExam
d.show()
}
}
class FinallyExam{
  @throws(classOf[ArrayIndexOutOfBoundsException]) 
  @throws(classOf[ArithmeticException])
  @throws(classOf[IOException])
  def show() {
    var myList = Array(1.9, 2.9, 3.4, 3.5)
    
    val a:Int=5
    val b:Int=5
   
   try{
    var d=a/b
    println(d)
    println(myList(9)) 
    throw new ArithmeticException("arithmetic exception")
    
    }
    catch {
       
      case ex: ArithmeticException=>{
        println("Arithmetic Exception found...")
      }
      case ex: IOException => {
            println("IO Exception")
         }
       case ex:Exception => {
        println("exception caught")
      }
      
    }
    finally{
      println("Finally exiting...")
    }
  }
}