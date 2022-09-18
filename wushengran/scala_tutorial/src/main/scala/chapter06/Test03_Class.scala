package chapter06

import scala.beans.BeanProperty

object Test03_Class {
  def main(args: Array[String]): Unit = {
    val s1 = new Student()
    // s1.name 不能访问 private
    println(s1.age)
    println(s1.sex)
    s1.sex = "female"
    println(s1.sex)
    s1.setAge(99)
    println(s1.getAge)
  }
}

class Student{
  private var name: String = "alice"
  // val age: Int = _ // error
  @BeanProperty
  var age: Int = _
  var sex: String = "male"
}