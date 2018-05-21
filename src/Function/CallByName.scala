package Function

object CallByName {
def main(args: Array[String]): Unit = {
  delayed(time);  
}

def time() = {
  println("I am in Time Method");
  System.nanoTime();
}

def delayed(t:Long) ={
   println("I am in Delayed Method");
   println(s"Param $t")
}
}