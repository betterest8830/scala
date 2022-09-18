package chapter05

object Test11_ControlAbstract {
  def main(args: Array[String]): Unit = {
    // 传值参数
    def f0(a: Int): Unit = {
      println("a : " + a)
      println("a : " + a)
    }

    f0(23)

    def f1(): Int = {
      println("f1 调用")
      12
    }
    f0(f1())

    // val 和 def 都可定义
    // def f = ()=> {
    val f = ()=> {
      println("f...")
      10
    }
    f0(f())
    println("=================")
    // 传名参数(传递不再是具体的值而是代码块)
    def f2(a: =>Int): Unit = {
      println(a)
      println(a)
    }
    f2(11)
    f2(f1())
    f2({
      println("tootoo")
      22})
    f2{
      println("tootoo")
      22}

    // 自定义while
    var i:Int = 1
    myWhile3{i <= 10}{
      println(i)
      i +=1
    }

    // 用闭包实现一个函数，将代码块作为参数传入, 递归调用
    def myWhile(condition: =>Boolean): (=>Unit)=>Unit = {
      def doLoop(op: => Unit): Unit = {
        if (condition){
          op
          myWhile(condition)(op)
        }
      }
      doLoop _
    }

    // 匿名函数
    def myWhile2(condition: =>Boolean): (=>Unit)=>Unit = {
      op => {
        if (condition){
          op
          myWhile2(condition)(op)
        }
      }
    }

    // 科里化
    def myWhile3(condition: =>Boolean)(op: =>Unit):Unit = {
      if (condition){
        op
        myWhile3(condition)(op)
      }
    }

  }
}
