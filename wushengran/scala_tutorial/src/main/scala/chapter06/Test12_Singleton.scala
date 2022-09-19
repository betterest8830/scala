package chapter06

object Test12_Single {
  def main(args: Array[String]): Unit = {
    val student1 = Student12.getInstance()
    student1.printInfo()

    val student2 = Student12.getInstance()
    student2.printInfo()

    println(student1)
    println(student2)

  }
}

class Student12 private (val name: String, val age: Int){
  def printInfo(): Unit = {
    println(s"Student: ${name}, ${age}, ${Student11.school}")
  }
}
// 饿汉式
/*
object Student12{
  private val student: Student12 = new Student12("aaa", 111)
  def getInstance(): Student12 = student
}
*/
// 懒汉式
object Student12{
  private var student: Student12 = _
  def getInstance(): Student12 = {
    if (student == null) {
      student = new Student12("bbb", 222)
    }
    student
  }
}