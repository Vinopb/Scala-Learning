package CollectionSample

object WithoutOption {
def main(args: Array[String]): Unit = {
  var detail = Map(1->"India",2->"USA");
  println("Country=" +detail.get(1));
   println("Country=" +detail.get(4));
}
}