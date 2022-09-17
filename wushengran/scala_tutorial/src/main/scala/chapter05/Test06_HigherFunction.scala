package chapter05

object Test06_HigherFunction {
  def main(args: Array[String]): Unit = {
    def foo():Unit = {
      println("foo...")
    }

    // 调用 foo 函数，把返回值给变量 f
    //val f = foo()
    val f = foo
    println(f)

    // 在被调用函数 foo 后面加上 _， 相当于把函数 foo 当成一个整体， 传递给变量 f1
    val f1 = foo _
    val f2: () => Unit = foo
    println(f1)
    println(f2)

    // 函数可以作为函数返回值返回
    def f3() = {
      def f4() = {
        println("function 3,4, 5")
      }
      f4 _ // 当函数直接返回，不是调用
    }
    val f5 = f3()
    f5()
    f3()()
    
  }
}
