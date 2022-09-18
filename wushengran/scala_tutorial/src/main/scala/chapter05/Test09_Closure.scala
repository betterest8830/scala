package chapter05

object Test09_Closure {
  def main(args: Array[String]): Unit = {
    def f1(a: Int): Int => Int = {
      def f2(b: Int) = {
        a + b
      }
      // f2 _
       f2
    }

    // 匿名函数
    def f11(a: Int): Int => Int = a + _

    // 科里化
    def f111(a: Int)(b: Int) = {
      a + b
    }

    var f = f1(4)
    println(f(5))
    println(f(7))

    f = f1(20)
    println(f(5))
    println(f(7))
    println(f1(20)(7))

    println(f11(20)(7))
    println(f111(20)(7))

  }
}
