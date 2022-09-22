package chapter07

import scala.collection.mutable.ArrayBuffer

object Test02_MutableArray {
  def main(args: Array[String]): Unit = {
    val arr01 = new ArrayBuffer[Any]()
    val arr02 = ArrayBuffer(1, 2, 3)
    val arr03 = ArrayBuffer(1234,2323)
    println(arr02.mkString(", "))
    println(arr02)

    println(arr02(0))

    val newArr1 = arr01 :+ 5
    println(arr01)
    println(newArr1)
    println(arr01 == newArr1)

    // 追加元素
    arr02.+= (0) // 后面追加
    77 +=: arr02 // 前面追加
    // 推荐可变类型推荐使用 下面方法
    arr02.append(4, 5)
    arr02.prepend(33)
    arr02.insert(0, 111, 222)
    arr02.insertAll(1, arr03)
    println(arr02)
    println(arr02.hashCode())

    arr02.remove(0) // 删除索引
    arr02.remove(0,2)
    println(arr02)
    // 删除数值
    arr02 -= 33
    println(arr02)

    // 多维数组
    val arr = Array.ofDim[Int](3, 4)
    arr(1)(2) = 88
    for(i <- arr){
      for(j <- i){
        print(j +" ")
      }
      println()
    }

    for(i <- arr; j <- i) print(j)
    println()
    arr.foreach(_.foreach(print))

  }
}
