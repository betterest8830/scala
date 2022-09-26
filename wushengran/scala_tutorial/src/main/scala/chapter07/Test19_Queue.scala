package chapter07

import scala.collection.immutable.Queue
import scala.collection.mutable

object Test19_Queue {
  def main(args: Array[String]): Unit = {
    val queue = mutable.Queue[String]()
    queue.enqueue("hello", "scala", "world")
    println(queue)
    println(queue.dequeue())
    println(queue)

    //不可变队列
    val queue2 = Queue("a", "b", "c")

    val queue3 = queue2.enqueue("d")
    println(queue3)


  }
}
