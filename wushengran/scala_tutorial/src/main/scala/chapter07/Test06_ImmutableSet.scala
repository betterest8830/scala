package chapter07

object Test06_ImmutableSet {
  def main(args: Array[String]): Unit = {
    val s1 = Set(1,2,2,3);
    println(s1)
    val s2 = s1 + 20
    println(s2)
    val s3 = s1 - 2
    println(s3)

    // 合并
    val s4 = s1 ++ s2
    println(s4)

    val s5 = s2 -- s1
    println(s5)

  }
}
