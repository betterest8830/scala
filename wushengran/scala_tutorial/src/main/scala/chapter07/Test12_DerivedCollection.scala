package chapter07

object Test12_DerivedCollection {
  def main(args: Array[String]): Unit = {
    val list1 = List(1,2,3,6,88)
    val list2 =List(1,2,3,77,99)

    println(list1.head)
    println(list1.tail) // List(2, 3, 6, 88)

    println(list1.last)
    println(list1.init) // List(1, 2, 3, 6)

    println(list1.reverse)

    // 取前（后）n 个元素
    println(list1.take(3))
    println(list1.takeRight(3))

    //（7）去掉前（后）n 个元素
    println(list1.drop(3))
    println(list1.dropRight(3))

    println(list1.union(list2)) // 直接合起来，不去重，set 会去重
    println(list1 ::: list2)

    println(list1.intersect(list2))

    println(list1.diff(list2))

    // 拉链 注:如果两个集合的元素个数不相等，那么会将同等数量的数据进行拉链，多余的数据省略不用
    println(list1.zip(list2))

    println(list1.sliding(2))
    list1.sliding(2).foreach(println)
    list1.sliding(2,2).foreach(println)

  }
}
