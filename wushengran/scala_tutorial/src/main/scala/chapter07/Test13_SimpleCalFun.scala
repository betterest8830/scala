package chapter07

object Test13_SimpleCalFun {
  def main(args: Array[String]): Unit = {
    val list1 = List(5, 1,8,-2, -6)
    println(list1.sum)
    println(list1.product)
    println(list1.max)
    println(list1.min)

    val list2 = List(("a", 5), ("b",1), ("c",8), ("d", -2))

    println(list2.max)
    println(list2.maxBy((tuple: (String, Int)) =>{tuple._2}))
    println(list2.maxBy(_._2))
    println(list2.minBy(_._2))

    // 排序
    println(list2.sorted)
    println(list1.sorted(Ordering[Int].reverse))

    println(list1.sortBy(_.abs))
    println(list1.sortBy(-_))
    println(list2.sortBy(_._2)(Ordering[Int].reverse))

    // 升序排列
    println(list1.sortWith((x, y) => x < y))
    println(list1.sortWith(_<_))
    // 降序排列
    println(list1.sortWith((x, y) => x > y))

  }
}
