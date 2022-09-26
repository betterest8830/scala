package chapter08

object Test05_MatchCaseClass {
  def main(args: Array[String]): Unit = {
    val student = Student1("alice", 18)

    val result = student match {
      case Student1("alice", 18) => "Alice, 18"
      case _ => "Else"
    }
    println(result)
  }
}

// 定义成样例类
case class Student1(name: String, age: Int) // 默认为字段都为属性
