//90-days coding challenge
//vipul vaibhaw

object Example2{
  def main(args: array[String]){
    var a=0;
    val numList = List(1,2,3,4,5,6,7,8,9,10);
    for (a <- numList
      if a!= 3; if a<8)
      {
        println( "Value of a: " + a );
      }
  }
}
