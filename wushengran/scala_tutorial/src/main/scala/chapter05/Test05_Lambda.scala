package chapter05

object Test05_Lambda {
  def main(args: Array[String]): Unit = {
    // 匿名函数，lambda 表达式
    //(name: String) => {println(name)}
    def f2 = (name: String) => {println(name)}
    // 数据是定死了的，函数不一定
    def f3(f: String=>Unit) = {
      f("hhhh")
    }
    f3(f2)
    println(f3((x:String)=>{println("wwww")}))

    // 匿名函数简化原则


  }
}
