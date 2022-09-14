package chapter02

import java.io.{File, PrintWriter}
import scala.io.Source

object Test05_FileIO {
  def main(args: Array[String]): Unit = {
    // 1. read from file
    Source.fromFile("src/main/resources/test1.txt").foreach(print)
    // 2. write to file (java)
    val writer = new PrintWriter(new File("src/main/resources/test2.txt"))
    writer.write(123)
    writer.write("hello")
    writer.close()
  }
}
