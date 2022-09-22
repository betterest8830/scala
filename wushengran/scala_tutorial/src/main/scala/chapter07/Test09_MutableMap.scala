package chapter07

import scala.collection.mutable


object Test09_MutableMap {
  def main(args: Array[String]): Unit = {

    val map1 = mutable.Map("a"-> 1, "b"->2)
    println(map1)
    println(map1.getClass)

    map1.put("c", 5)
    map1 += "d"->5
    map1 += (("e", 5))
    println(map1)

    map1 -= "d"
    map1.remove("e")
    println(map1)

    map1("b") = 22
    map1.update("b", 222)
    println(map1)

    val map2 = mutable.Map("aa"-> 1, "b"->233)
    //map1 ++= map2
    //println(map1)
    // 没有--= ？
    println(map1)

  }
}
