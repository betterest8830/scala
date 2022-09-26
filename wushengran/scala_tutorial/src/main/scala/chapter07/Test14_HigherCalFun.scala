package chapter07

import scala.collection.mutable

object Test14_HigherCalFun {
  def main(args: Array[String]): Unit = {

    // map 操作
    val list1 = List(1,2,3,4,5,6,7)
    println(list1)
    println(list1.filter(_%2 == 0))
    println(list1.map(_*2))

    val nestedList: List[List[Int]] = List(List(1, 2, 3), List(4, 5, 6), List(7, 8, 9))
    val wordList: List[String] = List("hello world", "hello atguigu", "hello scala")

    println(nestedList(0):::nestedList(1):::nestedList(2))
    println(nestedList.flatten)
    // 扁平化+映射 注： flatMap 相当于先进行 map 操作，在进行 flatten 操作
    println(wordList.map(_.split(" ")))
    println(wordList.flatMap(_.split(" ")))

    val nestedList2 = List(List(1, 2, 3), List(4, List(5,6)))
    println(nestedList2.flatten)

    // 分组
    println(list1.groupBy(_%3))
    println(list1.groupBy(data=>if(data%2==1) "奇数" else "偶数"))
    val wordList2: List[String] = List("world", "atguigu", "scala", "Student")
    println(wordList2.groupBy(_.charAt(0).toUpper))

    // reduce 操作
    println("=================================")
    val list2 = List(1, 2, 3, 4)
    println(list2.reduce(_+_))
    println(list2.reduce(_-_))
    println(list2.reduceLeft(_-_))
    println(list2.reduceRight(_-_))

    println(list2.fold(5)(_+_))
    println(list2.foldLeft(5)(_+_))
    println(list2.foldRight(10)(_-_))

    val map1 = mutable.Map("a"->1, "b"->2, "c"->3)
    val map2 = mutable.Map("a"->4, "b"->5, "d"->6)
    val map3 = map2.foldLeft(map1){
      (map, kv) =>{
        val k = kv._1
        val v = kv._2
        map(k) = map.getOrElse(k, 0) + v
        map
      }
    }
    println(map3)

  }
}
