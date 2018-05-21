package CollectionSample

object ListSample {
  def main(args: Array[String]): Unit = {
    var a:List[String] = List("C#","scala","python");
    println(a);
    
    var t = List(1,5,7,6,8,2,4);   
    
    var x = t :+ 10
    
    println(t);
    
    println(x);
    
        
    var d= List(1,5,7,6,8,2,4).sorted;
    
    println("s"+d(2));
    
    for(f<-a){
      println(f);
    }
    
     println("head of list " + a.head);
     println("tail of list " +a.tail);
     println("isEmpty of list " +a.isEmpty);
     println("take of list " +a.take(1));
  };

}