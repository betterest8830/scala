package chapter05

object Test03_FunctionParameter {
  def main(args: Array[String]): Unit = {
    def f1(str: String*): Unit = {
      println(str)
    }
    f1("aaa")
    f1("bb", "cc")

  }
}
