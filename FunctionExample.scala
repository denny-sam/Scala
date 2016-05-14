//90-days coding challenge
//Vipul Vaibhaw

object FunctionExample {
  def main(args:Array[String]){
    printStrings("Vipul","is","dangerous");
  }
  def printStrings(args: String*){
    var i : Int = 0;
    for (arg <- args){
      println("Arg value[" + i + "] = " + arg);
      i += 1;
    }
  }
}
