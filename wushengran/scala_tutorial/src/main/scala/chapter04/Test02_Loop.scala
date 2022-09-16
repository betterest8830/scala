package chapter04

object Test02_Loop {
  def main(args: Array[String]): Unit = {
    for(i <- 1 to 5){
      println(i)
    }
    // Int  RichInt 隐式转换
    for(i: Int <- 1 until  5 by 2){
      println(i)
    }

  }
}
