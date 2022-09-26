package chapter09

object Test02_Implicit {
  def main(args: Array[String]): Unit = {

    //val new12 = new MyRichInt(12)
    //println(new12.myMax(15))

    // 隐式函数
    implicit def convert(num: Int): MyRichInt = new MyRichInt(num)
    println(12.myMax(15))

    // 隐式类
    println(12.myMax2(15))

    // 隐式参数
    def sayHello(name: String = "bob"): Unit = {
      println("hello, " + name)
    }

    sayHello("alice")
    sayHello()

    implicit val str: String = "zzz"
    def sayHi(implicit name: String): Unit = {
      println("hi, " + name)
    }
    // sayHi() errpr
    sayHi

    // 简便写法
    implicit val num: Int = 88
    def hiAge(): Unit = {
      println("hi, " + implicitly[Int])
    }
    hiAge
    hiAge()

  }

  implicit class MyRichInt2(val self: Int){
    def myMax2(i: Int) = {
      if (self < i) i else self
    }

    def myMin2(i: Int): Int = {
      if (self < i) self else i
    }
  }

}

class MyRichInt(val self: Int){
  def myMax(i: Int) = {
    if (self < i) i else self
  }

  def myMin(i: Int): Int = {
    if (self < i) self else i
  }
}


