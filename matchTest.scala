/**
  * Created by vipul vaibhaw on 1/6/2017.
  */

object LearningScala {
  def main(args:Array[String]): Unit ={
    println(matchTest(55))
    println(matchTest(2))
    println(matchTest(1))
  }
  def matchTest(x:Int):String = x match{
    case 1 => "one"
    case 2 => "TWO"
    case y: Int => "scala.Int"
  }
}
