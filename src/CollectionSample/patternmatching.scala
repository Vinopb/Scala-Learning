package CollectionSample

object patternmatching {
def main(args: Array[String]): Unit = {
  
  println(test(22));
  println(test(5));
  println(test(100));
  
  //case <pattern> <boolean expression sample if> => <expression block>
  
  val s= 55;
  
  val a = s match{
    case s if s<=20 => println("low fuel red alert");
    case s if s==50 || s== 60 => println("grenn alert fine");
    case s if s>=20 => println("danger zone");
    case _=> println("invalid");    
  }
}

def test(x:Int):String = x match{
  case 22 => "one"
  case 2|5 => "two"
  case _ => "many"
}
}

