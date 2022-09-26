package chapter08

object Test06_PartialFunction {
  def main(args: Array[String]): Unit = {

    val list = List(("a", 12), ("b", 35), ("c", 27), ("a", 13))

    // 1. map 转换
    val newList = list.map(tuple => (tuple._1, tuple._2 *2))

    // 2. 用模式匹配对元祖元素赋值
    val newList2 = list.map(
      tuple =>{
        tuple match {
          case (word, count) => (word, count *2)
        }
      }
    )

    // 3. 省略 lambda 表达式进行简化 （偏函数）
    val newList3 = list.map{
          case (word, count) => (word, count *2)
        }

    println(newList)
    println(newList2)
    println(newList3)

    // 偏函数应用
    val positiveAbs: PartialFunction[Int, Int] = {
      case x if x > 0 => x
    }

    val negativeAbs: PartialFunction[Int, Int] = {
      case x if x < 0 => -x
    }

    val zeroAbs: PartialFunction[Int, Int] = {
      case x if x == 0 => 0
    }

    def myAbs(x: Int) = (positiveAbs orElse negativeAbs orElse zeroAbs) (x)
    println(myAbs(-8))

  }
}
