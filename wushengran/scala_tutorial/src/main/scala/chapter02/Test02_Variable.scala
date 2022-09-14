package chapter02

import chapter01.Student

object Test02_Variable {
  def main(args: Array[String]): Unit = {
    var a: Int = 10
    //（1）声明变量时，类型可以省略，编译器自动推导，即类型推导
    var a1 = 10
    //（2）类型确定后，就不能修改，说明 Scala 是强数据类型语言。
    //（3）变量声明时，必须要有初始值
    //（4）在声明/定义一个变量时，可以使用 var 或者 val 来修饰，var 修饰的变量可改变，val 修饰的变量不可改。
    //（5）var 修饰的对象引用可以改变，val 修饰的对象则不可改变，但对象的状态（值） 却是可以改变的。（比如：自定义对象、数组、集合等等）
    val p2 = new Person()
    p2.name="jinlian"
    // p2 = null // 错误的，因为 p2 是 val 修饰的
    var bob = new Student("bob", 22)
    bob.age = 30
    bob.printInfo()
  }
}

class Person{
  var name : String = "jinlian"
}

