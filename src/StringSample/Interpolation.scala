package StringSample

object Interpolation {

  def main(args: Array[String]): Unit = {
      val h = "How";
  
     println(s"Hi vinod $h are you? $h is your job $h was the day")
     
     var height = 107.56707896
     var name ="james";
     println(f"$name is $height%1.4f meters tall")
     
     println("ab\ncd\tef");
     println(raw"ab\ncd\tef");
  }
 
}