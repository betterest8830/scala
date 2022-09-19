package chapter06

object Test11_Object {
  def main(args: Array[String]): Unit = {
    //val student = new Student11("alice", 32)
    var student = Student11.newStudent("alice", 32)
    student.printInfo()
    student = Student11.apply("bob", 11)
    student.printInfo()
    student = Student11("lily", 20)
    student.printInfo()

  }
}

class Student11 private (val name: String, val age: Int){
  def printInfo(): Unit = {
    println(s"Student: ${name}, ${age}, ${Student11.school}")
  }
}

object Student11{
  val school: String = "atguigu"

  // 定义一个类的对象的实例创建方法
  def newStudent(name: String, age: Int): Student11 = new Student11(name, age)

  def apply(name: String, age: Int): Student11 = new Student11(name, age)
}