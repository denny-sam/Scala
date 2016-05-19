//90-days coding challenge
//Vipul Vaibhaw

import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException

object tryCatch {
   def main(args: Array[String]) {
      try {
         val f = new FileReader("input.txt")
      } catch {
         case ex: FileNotFoundException => {
            println("File does not exists")
         }
         case ex: IOException => {
            println("IO Exception")
         }
      } finally {
         println("This will execute anyhow...")
      }
   }
}