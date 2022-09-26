package chapter08

object Test02_MatchTypes {
  def main(args: Array[String]): Unit = {
    println(describleConst(5))
    println(describleConst(6))

    println(describeType("test"))
    println(describeType(Array(1,2,3)))
    println(describeType(Array("a","b")))
    // list 存在泛型擦除， array 不存在
    println(describeType(List(1,2,3)))
    println(describeType(List("a","b")))
    println(describeType('c'))

    describedArray()
    describeList1()
    describeList2()

    describeTupleExtend1()
    describeTupleExtend2()
  }

  def describleConst(x: Any) = x match {
    case 5 => "Int"
    case "hell0" => "String"
    case true => "Boolen"
    case '+' => "Char"
    case _ => "others"
  }

  def describeType(x: Any) = x match {
    case i: Int => "Int"
    case s: String => "String"
    case arr: Array[Int] => "Array[Int] " + arr
    case list: List[Int] => "list " + list
    case other => "other: " + other // 不能用 _ 替换
  }

  def describedArray()={
    for(arr <- List(
      Array(0),
      Array(1, 0),
      Array(0, 1, 0),
      Array(1, 1, 0),
      Array(2, 3, 7, 5),
      Array("hello", 20, 30)
    )){
      val result = arr match {
        case Array(0) => "0"
        case Array(1, 0) => "Array(1, 0)"
        case Array(x, y) => x + "," + y
        case Array(x, 1, z) => "中间为1 的三元数组 " + arr.mkString(", ")
        case Array(0, _*) => "以 0 开头的数组"
        case _ => "something else"
      }
      println(result)
    }
  }

  def describeList1()={
    for(list <- List(
      List(0),
      List(1, 0),
      List(0, 0, 0),
      List(1, 1, 0),
      List(88),
      List("hello")
    )){
      val result = list match {
        case List(0) => "0"
        case List(x, y) => "list(x, y): " + x + ", " + y
        case List(0, _*) => "list(0,...)"
        case List(a) => "list(a): " + a
        case _ => "something else"
      }
      println(result)
    }
  }

  def describeList2() = {
    val list = List(1, 2, 5, 7, 24)
    list match {
      case first::second::rest => println(first + "-" + second + "-" + rest)
      case _ => println("something else")
    }

  }

  // 声明时候模式匹配赋值
  def describeTupleExtend1()={
    val (x, y) = (10, "hello")
    println(x)
    println(y)

    val List(first, second, _*) = List(12, 13, 14, 15) // 必须是下划线
    println(first)
    println(second)

    val fir::sec::res = List(12, 13, 14, 15)
    println(fir, sec, res)

  }

  // for 推导式中进行模式匹配
  def describeTupleExtend2(): Unit ={
    val list = List(("a",1),("b",2),("c",4))

    for(elem <- list){
      println(elem._1, elem._2)
    }
    for((word, count) <- list){
      println(word, count)
    }

    for(("a", count) <- list){
      println(count)
    }

  }

}
