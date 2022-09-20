package chapter06

object Test17_Extends {
  def main(args: Array[String]): Unit = {
    val student = new Student17("aaa", 17)
    val person = new Student17("bbb",18)

    println(student.isInstanceOf[Student17])
    println(student.isInstanceOf[Person17])
    println(person.isInstanceOf[Student17])
    println(person.isInstanceOf[Person17])

    if(person.isInstanceOf[Student17]){
      val student1 = person.asInstanceOf[Student17]
      student1.study()
    }
    println(classOf[Student17])

    println(WorkDay.THEUS)
  }
}

class Person17(val name: String, val age: Int){
  def sayHi(): Unit = {
    println("hi from person" + name)
  }
}

class Student17(name: String, age: Int) extends Person17(name, age){
  override def sayHi(): Unit = {
    println("hi from student" + name)
  }

  def study(): Unit = {
    println("I am studying")
  }
}

object WorkDay extends Enumeration{
  val MON=Value(1, "monday")
  val THEUS=Value(2, "thuesay")
}

object  TestApp extends App{
  println("xxx")
  type MyString = String
  val a: MyString = "111"
  println(a)
}