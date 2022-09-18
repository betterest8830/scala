package chapter05

object Test13_Lazy {
  def main(args: Array[String]): Unit = {
    lazy val res = sum(10, 30)
    println("1. ----------------------")
    println("2. res=" + res)
    println("2. res=" + res) // 不同于传名参数

    def sum(a: Int, b: Int): Int = {
      println("3. sum is calling")
      a + b
    }
  }
}
