package chapter07

import scala.collection.mutable.ListBuffer

object Test05_MutableList {
  def main(args: Array[String]): Unit = {
    val buffer1 = ListBuffer(1,2,3)
    val buffer2 = new ListBuffer[Int]()

    println(buffer1)
    println(buffer2)
    buffer1.+=(5)
    buffer1 += 55
    31 +=: buffer1 // 冒号在结尾的符号，从右到左的调用
    buffer1.append(6)
    buffer1.prepend(6)
    buffer1.insert(1,22)

    println(buffer1)

    buffer2.append(111)
    val buffer3 = buffer1 ++ buffer2
    println(buffer3)
    buffer1 ++= buffer2
    buffer1 ++=: buffer2
    println(buffer1)
    println(buffer2)

    buffer3(1) = 555
    buffer3.update(0, 77)
    println(buffer3)

    buffer3.remove(1,2)
    buffer3 -= 55
    println(buffer3)

  }
}
