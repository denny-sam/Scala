import java.io._;

object FileWriter {
  def main (args:Array[String]){
    write("Test","Hello")
  }
  def write(x:String,y:String){
    val writer = new File(x+".txt" )
    val bw = new BufferedWriter(new FileWriter(writer,true))
    val out = new PrintWriter(bw)
    out.println(y+"\n")
    bw.close();
  }
}
