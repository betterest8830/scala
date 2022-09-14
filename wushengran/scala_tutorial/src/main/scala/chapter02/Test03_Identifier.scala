package chapter02

object Test03_Identifier {
  def main(args: Array[String]): Unit = {
    // ok 因为在 Scala 中 Int 是预定义的字符, 不是关键字，但不推荐
    var Int: String = "hello1"
    println(Int)
    // error 单独一个下划线不可以作为标识符，因为_被认为是一个方法
    var _: String = "hello2"
    //println(_)
    var +*-/#! : String = "" // ok
    // ok 用反引号`....`包括的任意字符串,包括关键字
    var `if` : String = ""

  }
}
