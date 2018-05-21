package CollectionSample

object SetSample {

  def main(args: Array[String]): Unit = {
    var a:Set[Int] = Set(12,1,2,5,9,8,10,10);
    
    var t = Set(6,9,null)
    
    println(t);
    println(a);
    
    println("head of list " + a.head);
     println("tail of list " +a.tail);
     println("isEmpty of list " +a.isEmpty);
    println("take of list " +a.take(1));
  }
}