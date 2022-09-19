package chapter06

object Test13_Trait {
  def main(args: Array[String]): Unit = {
    // 重写冲突的属性和方法
    val student = new Student13
    student.play()
    student.increase()
    student.dating()
    student.increase()
    student.study()
    student.increase()

    // 动态混入
    println("===================")

    val studentWithTalent = new Student13 with Talent{
      override def dancing(): Unit = {
        println(s"${name} is dancing")
      }

      override def singing(): Unit = {
        println(s"${name} is singing")
      }
    }
    studentWithTalent.singing()
    studentWithTalent.dancing()
    studentWithTalent.play()

  }
}

class Person13{
  val name: String = "Person"

  def play(): Unit = {
    println(s"${name} is playing")
  }
}

trait Young{
  val name: String = "young"
  var age: Int

  def dating(): Unit

}

trait Knowledge{
  var amout: Int = 0
  def increase(): Unit
}

trait Talent {
  def singing(): Unit
  def dancing(): Unit
}

class Student13 extends Person13 with Young with Knowledge {
  override val name: String = "student"

  var age: Int = 11

  def study() = {
    println(s"${name} is studying")
  }
  override def dating(): Unit = {
    println(s"${name} is dating")
  }

  override def increase(): Unit = {
    amout += 1
    println(s"${name} know increase ${amout}")
  }

}

