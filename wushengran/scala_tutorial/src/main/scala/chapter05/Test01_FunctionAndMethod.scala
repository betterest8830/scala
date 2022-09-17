package chapter05

object Test01_FunctionAndMethod {
  def main(args: Array[String]): Unit = {
    //函数
    def sayHi(name: String) : Unit={
      println(s"hi, ${name}")
    }

    sayHi("lili")
    Test01_FunctionAndMethod.sayHi("bobo")

  }
  // 方法
  def sayHi(name: String) : Unit={
    println(s"HI, ${name}")
  }

}
