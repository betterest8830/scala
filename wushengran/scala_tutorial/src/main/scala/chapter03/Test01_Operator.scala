package chapter03

object Test01_Operator {
  def main(args: Array[String]): Unit = {
    var r: Double = 10.0 / 3
    println("r = " + r.formatted("%8.2f"))

    val s1 = "abc"
    val s2 = new String("abc")

    println(s1 == s2) // 内容是否相等，与 java发生了变化，相当于 == 实现了 equals
    println(s1.equals(s2)) // 内容是否相等
    println(s1.eq(s2)) // scala 判断地址的方法

    var b: Byte = 10
    //b += 1 // 不会默认做强转
    println(b)
  }
}
