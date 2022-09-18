package chapter06

object Test04_Access {
  def main(args: Array[String]): Unit = {
    val person = new Person()
    person.printInfo()
    val worker = new Worker()
    worker.printInfo()
  }
}

// 定义一个子类
class Worker extends Person{
  override def printInfo(): Unit = {
    name = "bob"
    age = 25
    sex = "male"
    println(s"Worker: ${name}, ${sex}, ${age}")
  }
}