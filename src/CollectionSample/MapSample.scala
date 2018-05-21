package CollectionSample

object MapSample {
def main(args: Array[String]): Unit = {
  var t = Map(1->"scala",4->"java",3->"oops",2->"c");
  println(t);
  println("To get the keys" +t.keys)
  println("To get the keys" +t.values)
  println("To get the keys" +t.isEmpty)
  
  t.foreach(f => println(f));
}
}