package StringSample

object Stringbuffer {
def main(args: Array[String]): Unit = {
  var sb = new StringBuffer("scala");
  sb.append("programm")
  println(sb)
  
  var sb1 = new StringBuilder("vinod");
  sb1.append("padmanaban")
  println(sb1)
}
}