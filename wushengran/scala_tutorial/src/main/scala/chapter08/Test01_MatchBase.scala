package chapter08

object Test01_MatchBase {
  def main(args: Array[String]): Unit = {
    val a = 10
    val b = 20
    var operator = "d"
    var result = operator match {
      case "+" =>  a + b
      case "-" => a -b
      case "*" => a * b
      case "/" => a / b
      case _ => "illegal"
    }
    println(result)

  def myAbs(x: Int) =
        x match {
          case i if i >= 0 => i
          case j if j < 0 => -j
          case _ => "type illegal"
        }
    println(myAbs(-2))
    println(myAbs(33))

  }
}
