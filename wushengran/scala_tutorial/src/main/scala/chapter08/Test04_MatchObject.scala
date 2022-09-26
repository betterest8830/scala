package chapter08

object Test04_MatchObject {
  def main(args: Array[String]): Unit = {

    val student = new Student("alice", 18)

    val result = student match {
      case Student("alice", 18) => "Alice, 18"
      case _ => "Else"
    }
    println(result)

  }
}

class Student(val name: String, val age: Int)

object Student{
  def apply(name: String, age: Int): Student = new Student(name, age)
  // 必须实现一个unapply 方法，用来对对象的属性进行拆解
  def unapply(student: Student): Option[(String, Int)] = {
    if(student == null)
      None
    else
      Some(student.name, student.age)
  }
}

