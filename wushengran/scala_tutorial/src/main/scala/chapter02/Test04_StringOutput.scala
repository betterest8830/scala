package chapter02

import scala.io.StdIn

object Test04_StringOutput {
  def main(args: Array[String]): Unit = {
    var name: String = "jinlian"
    var age: Int = 10
    println(name + ": " + age)
    println(name * 2)
    printf("%s: %d\n", name, age)
    println(s"${name}: ${age}")
    val s1 =
      """
        |select
        |   name,
        |   age
        |from user
        |""".stripMargin
    println(s1)

    val s2 =
      s"""
        |select
        |   ${name},
        |   ${age+5}
        |from user
        |""".stripMargin
    println(s2)

    val num1: Float = 2.3456989f
    println(f"num is ${num1}%3.3f") //格式化模板字符串
    println(raw"num is ${num1}%3.3f\n") // 只替换变量
    println(s"num is ${num1}%3.3f\n") // s"" 和 raw"" 的区别

    // 键盘输入
    println("input name:")
    var name2 = StdIn.readLine()
    println(s"hello, ${name2}")

  }
}
