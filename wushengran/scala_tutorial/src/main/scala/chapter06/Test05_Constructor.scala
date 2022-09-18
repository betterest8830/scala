package chapter06

object Test05_Constructor {
  def main(args: Array[String]): Unit = {
    val student1 = new Student1
    student1.student1()
    val student2 = new Student1("bob", 25)
  }
}

class Student1(){
  var name: String = _
  var age: Int = _
  println("1. 主构造方法被调用")

  def this(name: String){
    this() // 直接调用主构造器
    println("2. 辅助构造方法一")
    this.name = name
    println(s"name: ${name}, age: ${age}")
  }

  def this(name: String, age:Int){
    this(name) // 直接调用主构造器
    println("3. 辅助构造方法二")
    this.age = age
    println(s"name: ${name}, age: ${age}")
  }

  // 只是普通方法被调用，不是构造方法
  def student1(): Unit = {
    println("普通方法被调用")
  }

}