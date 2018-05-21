package Function

object variableargument {
  def main(args: Array[String]): Unit = {
    val u  = new month;
    u.monthprint("May","Jun","April")
  }
}

class month{
  def monthprint(x:String,y:String*){
    println(x +" "+ y);
    println(y(0));
  }
}