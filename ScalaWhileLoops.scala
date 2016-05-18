//90-days coding challenge
//Vipul Vaibhaw

import java.util.Calendar;

object ScalaWhileLoops {
  def main (args: Array[String]){
    def isFridayThirteen():Boolean = {
      val cal =  Calendar.getInstance(); 
      val dayofWeek = cal.get(Calendar.DAY_OF_WEEK)
      val dayofMonth = cal.get(Calendar.DAY_OF_MONTH)
      println(dayofWeek);
      (dayofWeek == 4 && dayofMonth== 18)
    }
    while(!isFridayThirteen()){
      println("Today isn't Friday 13th. Lame.")
      //sleep for a day
      Thread.sleep(86400000);
    }
    println("Its Wednesday");
  }
}