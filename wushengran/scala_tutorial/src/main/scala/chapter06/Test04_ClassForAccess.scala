package chapter06

object Test04_ClassForAccess {

}

// 定义一个父类
class Person{
  private var id: String = "111"
  protected  var name: String = "alice"
  var sex: String = "femal"
  private[chapter06] var age: Int = 18

  def printInfo(): Unit ={
    println(s"Person: ${id}, ${name}, ${sex}, ${age}")
  }
}
