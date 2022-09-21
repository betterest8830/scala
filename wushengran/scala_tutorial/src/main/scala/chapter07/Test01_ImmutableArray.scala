package chapter07

object Test01_ImmutableArray {
  def main(args: Array[String]): Unit = {
    val arr1 = new Array[Int](5)
    val arr2 = Array[Int]()
    val arr3 = Array(1, 2, 3)
    val arr4 = Array(1, 3, "abc")
    println(arr3)
    arr3(0) = 11
    //arr3.apply(0) = 11
    arr3.update(1, 12)
    println(arr3)
    println(arr3.mkString("Array(", ", ", ")"))

    println(arr3.mkString(", "))
    for(i <- 0 until arr3.length){
      println(i)
    }
    for(i <- arr3.indices){
      println(i)
    }
    // 增强for 循环
    for(i <- arr3){
      println(i)
    }

    println("==================")
    //迭代器的使用
    val iter = arr3.iterator
    while(iter.hasNext){
      println(iter.next())
    }

    //调用foreach 方法
    arr3.foreach(x => println(x))
    arr3.foreach(println(_))
    arr3.foreach(println)

    println(arr3)

    val arrnew1 = arr3.:+(5)
    //val arrnew1 = arr3 :+ 5

    println(arrnew1)
    println(arrnew1.mkString(", "))

    //val arrnew2 = arrnew1.+:(73)
    //val arrnew2 = arrnew1 +: 73 // error
    val arrnew2 = 73 +: arrnew1

    println(arrnew2)
    println(arrnew2.mkString(", "))

    val arrnew3 = 11 +: arrnew2 :+ 22 :+ 33
    println(arrnew3.mkString(", "))

  }
}
