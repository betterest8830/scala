package chapter02

object Test08_DataTypeConversion {
  def main(args: Array[String]): Unit = {
    var n: Int = 130
    var b: Byte = n.toByte
    println(b)
    println(128.toByte)
  }
}
