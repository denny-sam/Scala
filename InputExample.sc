//90-days coding challenge
//Vipul Vaibhaw
 
 object InputExample {
  def main (args: Array[String]){
    println("Enter number of lines: ");
    val num = Console.readInt();
    takeinput(num);
  }
  def takeinput(n:Int) {
    var line : String = "";
    for (a <- 1 to n){
      val line1 = Console.readLine;
      line = line + line1.trim + " ";
      println(line1);
    }
    println(line+".");
  }
}
