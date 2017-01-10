/**
  * Created by vipul vaibhaw on 1/9/2017.
  * Facebook-Hacker-Cup-2017 qualification round problem.
  * image uploaded
  */

class ProgressPieBar(){
  private val x_center = 50
  private val y_center = 50
  private val x_sector_start = 50-x_center
  private val y_sector_start = 100-y_center
  private val radius = 50

  def AreaOfSector(p:Int):Double = {
    val percent:Double= p.toDouble/100
    percent*(3.14*this.radius*this.radius)
  }

  def isPointInsideCircle(x:Int,y:Int):Boolean={
    val dist = (this.x_center-x)*(this.x_center-x) + (this.y_center-y)*(this.y_center-y)
    if(dist<=this.radius*this.radius){
      true
    }
    else
      false
  }

  def angleBetweenPoint(x1:Int,y1:Int): Double = {
    val lengthV2 = math.sqrt(math.pow((this.x_center-x1).toDouble,2)+math.pow((this.y_center-y1).toDouble,2))
    val modV2 = math.sqrt(math.pow(x1.toDouble,2)+math.pow(y1.toDouble,2))
    val cosAngle = (this.x_sector_start.toDouble*(x1-x_center).toDouble + this.y_sector_start.toDouble*(y1-y_center).toDouble)/(this.radius.toDouble*lengthV2.toDouble)
    //math.acos(cosAngle)
    math.acos(cosAngle).toDegrees

  }

  def angleOfSector(A:Double):Double = {
    //val theta = (A*360)/(3.14*this.radius.toDouble*this.radius.toDouble)
    val theta = (A/100)*360
    theta
  }

  def colorDeterminer(p:Int,x:Int,y:Int): String = {
    //val A = Areaofsector(p)
    if (angleBetweenPoint(x,y)<angleOfSector(p) & isPointInsideCircle(x,y)){
      "black"
    }
    else
      "white"
  }
}

object PieProgress {
  def main(args:Array[String]):Unit={
    val circle = new ProgressPieBar()
    //println(circle.AreaOfSector(33))
    //println(circle.isPointInsideCircle(50,100))
    //println(circle.angleOfSector(12))
    //println(circle.angleBetweenPoint(55,55))
    val testCases:Int = Console.readInt()
    for (i <- 1 to testCases){
      val ls = Console.readLine().split(" ")
      val circle = new ProgressPieBar()
      println(circle.colorDeterminer(ls(0).toInt,ls(1).toInt,ls(2).toInt))
    }
  }
}
