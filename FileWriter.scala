import java.io._;

object FileWriter {
  def main (args:Array[String]){
    write("Hello");
  }
  def write(x:String){
    val writer = new File("SüddeutscheZeitung.txt" )
    val bw = new BufferedWriter(new FileWriter(writer,true))
    val out = new PrintWriter(bw)
    out.println(x+"\n")
    bw.close();
  }
}
