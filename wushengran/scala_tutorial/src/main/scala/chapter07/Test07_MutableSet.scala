package chapter07

import scala.collection.mutable

object Test07_MutableSet {
  def main(args: Array[String]): Unit = {
    val s1 = mutable.Set(1,2,3)
    println(s1)

    s1 += 23
    println(s1)
    s1.add(44)
    println(s1)
    s1.remove(23)
    println(s1)

    val s2 = mutable.Set(9, 2, 3)
    println(s1 ++ s2)
    println(s1)
    s1 ++= s2 // 谁调用谁改变
    println(s1)

  }
}
