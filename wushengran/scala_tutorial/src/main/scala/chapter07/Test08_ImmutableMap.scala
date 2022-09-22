package chapter07

object Test08_ImmutableMap {
  def main(args: Array[String]): Unit = {
    // trait 不能 new
    val map1: Map[String, Int] = Map("a"-> 1, "b"->2)
    println(map1)
    println(map1.getClass)

    // 遍历元素
    map1.foreach(println)
    map1.foreach((kv:(String, Int)) => println(kv) )

    // 取 keys or values
    for(key <- map1.keys){
      println(s"${key}--->${map1.get(key)}") // a--->Some(1)
      println(s"${key}--->${map1.get(key).get}")
    }
    println(map1.get("d"))
    println(map1.get("d").getOrElse(0))
    println(map1.getOrElse("d", 0))

    println(map1("a"))

  }
}
