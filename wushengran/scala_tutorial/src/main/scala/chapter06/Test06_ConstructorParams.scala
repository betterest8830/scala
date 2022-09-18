package chapter06

object Test06_ConstructorParams {
  def main(args: Array[String]): Unit = {
    var person = new Student3("bobo", 18, "男")
    person.printInfo()
  }
}

class Student3(name: String, var age: Int, val sex: String){
  def printInfo(): Unit ={
    println(s"Student: name = ${name}, age = ${this.age}, sex = ${this.sex}")
  }
}