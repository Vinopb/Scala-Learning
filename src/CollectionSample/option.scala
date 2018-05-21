package CollectionSample

object option {
  
  def main(args: Array[String]): Unit = {
     var detail = Map(1->"India",2->"USA",3->"Russia");
  println("Country=" +display(detail.get(1)));
   println("Country=" +display(detail.get(4)));
  }
  
  def display(x:Option[String]) =  x match{
    case Some(s) => s
    case None =>"Not available";
  }

}