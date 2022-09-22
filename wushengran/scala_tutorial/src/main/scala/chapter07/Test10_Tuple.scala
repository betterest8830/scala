package chapter07

object Test10_Tuple {
  def main(args: Array[String]): Unit = {
    val tuple1 = (40, "hello", 3.14)
    println(tuple1)
    println(tuple1._1)
    println(tuple1._3)
    println(tuple1.productElement(0))

    for(elem <- tuple1.productIterator){
      println(elem)
    }

    val map = Map("a"->1, "b"->2, "c"->3)
    val map1 = Map(("a",1), ("b",2), ("c",3))
    println(map)
    map.foreach(tuple=>{println(tuple._1 + "=" + tuple._2)})

  }
}
