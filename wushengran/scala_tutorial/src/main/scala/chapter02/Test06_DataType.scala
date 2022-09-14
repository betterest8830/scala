package chapter02

object Test06_DataType {
  def main(args: Array[String]): Unit = {

    // 编译器会报错但是可以运行成功，因为 IDE 对 scala 兼容性不是很好
    var b1: Byte = 10 + 20
    println(b1)

    // error, 需要进行类型转换
    // var b2: Byte = b1 + 30
    var b2: Byte = (b1 + 30).toByte
    println(b2)

    var c1: Char = 'a'
    println(s"char1 : ${c1}")
    // error
    //var c2: Char = c1 + 1
    var c2: Char = 'a' + 1
    println(s"char2 :${c2}")
    println("special character: \\,\"")

    // 空值
    def testUnit():Unit={
      println("unit is called")
    }
    val a: Unit = testUnit()
    println(a)

    // 空引用
    // error: Null 可以赋值给任意引用类型（ AnyRef），但是不能赋值给值类型（ AnyVal）
    // val n:Int = null

    // Nothing
    def testNothing(n: Int): Int = {
      if(n == 0)
        throw new NullPointerException
      else
        n
    }
    println(testNothing(2))


  }
}
