package CollectionSample
import scala.collection.mutable.ListBuffer
object ListMuttable {

  def main(args: Array[String]): Unit = {
    
    var s=new ListBuffer[String]();
    s += "Mars";
    s += "Venus";
    s += "Jupiter";
    
    println(s(0));
    println(s);
    s(0) ="Sun"
    s += "Earth";
    s += "Earth";
    s += null;
    var x = s :+ "Moon"
    s.foreach { x => println(x)};
    
    val num = Seq(3,4,5,6,7,8,9,0,1);
    val even = num.partition(n=>(n%2)==1)
  }
}