package study

import scala.collection.immutable.ListMap
import scala.collection.mutable

object Study01 {
  def main(args: Array[String]): Unit = {
    val lines = List("atguigu han hello", "atguigu han aaa aaa aaa ccc ddd uuu")
    val map = mutable.Map[String, Int]()
    println(lines.flatMap(_.split(" ")))
    val wordsCount = lines.flatMap(_.split(" ")).foldLeft(map)((x, y) =>{
      x += (y -> (x.getOrElse(y, 0) + 1))
    })
    println(wordsCount)
    val wordsSort = wordsCount.toSeq.sortBy(_._2)
    println(wordsCount.toSeq)
    println(wordsSort)

    // :_*  等同于将wordsSort变成一个可变参数而不是一个参数传进去
    println(ListMap(wordsSort :_*))

  }
}
