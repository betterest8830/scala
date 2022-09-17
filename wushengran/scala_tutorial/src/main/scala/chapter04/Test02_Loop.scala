package chapter04

import scala.collection.immutable
import scala.util.control.Breaks

object Test02_Loop {
  def main(args: Array[String]): Unit = {
    // 1. 范围遍历
    for(i <- 1 to 5){
      println(i)
    }
    // Int  RichInt 隐式转换
    for(i: Int <- 1 until  5 by 2){
      println(i)
    }

    for(i <- new Range(1, 5, 1)){
      println(i)
    }

    for(i <- Range(1, 5)){
      println(i)
    }

    // 2. 集合遍历
    for(i <- Array(12, 33, 55)){
      println(i)
    }

    for(i <- 1.0 to 3.0 by 0.3 ){
      println(i)
    }

    // 循环嵌套
    for(i <- 1 to 3; j <- 1 to 2){
      println(s"${i} * ${j} = ${i * j}")
    }

    // 九层妖搭
    for(i <- 1 to 9; spaces = 9 - i; starts = 2 * i - 1){
      println(" " * spaces +  "*" * starts)
    }

    val ints: immutable.IndexedSeq[Int] = for(i <- 1 to 3) yield {
      i * 2
    }
    // 循环返回值
    println(ints)

    Breaks.breakable(
      for(elem <- 1 to 10){
        println(elem)
        //if(elem == 5) Breaks.break() // 实现原理就是抛出异常
      }
    )
    println("end")

  }

}
