package chapter06

object Test07_Inherit {
  def main(args: Array[String]): Unit = {
    val student1 = new Student07("alice", 18)
    val student2 = new Student07("bob", 22, "111")
  }
}

class Person07(){
  var name: String = _
  var age: Int = _
  println("1. 父类主构造器调用")

  def this(name: String, age: Int){
    this()
    println("2. 父类辅助构造器调用")
    this.name = name
    this.age = age
  }

  def printInfo(): Unit = {
    println(s"Person: $name, $age")
  }
}

class Student07(name: String, age: Int) extends Person07(){
  var stdNo: String = _
  println("3. 子类主构造器调用")

  def this(name: String, age: Int, stdNo: String){
    this(name, age)
    println("4. 子类辅助构造器调用")
    this.stdNo = stdNo
  }

  override def printInfo(): Unit = {
    println(s"Student: $name, $age, $stdNo")
  }
}