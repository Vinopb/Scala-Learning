package StringSample

object AlignMargin {
 def main(args: Array[String]): Unit = {
   var a = "hi this is scala language";
   var b:String ="hello";
   
   val s = """
     |Line1.hello are you fun
       |Line 2 what r u doing?
      | line 3 , getting reday """.stripMargin;
   
   println(s);
   
   val s1 = """
     All u  have to enclose
     |each end of your
     |multiline
     |string in three double quotes""".stripMargin.replaceAll("\n", "") 
     println(s1)
     }
     
}