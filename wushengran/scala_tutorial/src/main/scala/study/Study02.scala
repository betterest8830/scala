package study

// 1.隐式参数
object ImplicitParameters {

  //object相当于class的单个实例，类似于Java中的static，通常在里面放一些静态的field和method。
  //第一次调用object中的方法时，会执行object的constructor，也就是object内部不在method或者代码块中的所有代码，但是object不能定义接受参数的constructor
  implicit val name: String = "default"  // 定义隐式变量
  log("init")

  def log(msg: String)(implicit name: String): Unit = println(s"[$name] $msg")

  def process(): Unit = {
    implicit val name: String = "process"
    log("doing something")
  }

  def main(args: Array[String]): Unit = {
    implicit val name: String = "main"
    log("start")
    process()
    log("end")("custom name")
  }
}

// 2.隐式函数
import scala.language.implicitConversions
import java.time.LocalDate

class DateHelper(offset: Int) {
  def days(when: String): LocalDate = {
    val today = LocalDate.now
    when match {
      case "ago" => today.minusDays(offset)
      case "from_now" => today.plusDays(offset)
      case _ => today
    }
  }
}

object DateHelper {
  val ago = "ago"
  val from_now = "from_now"

  implicit def convertInt2DateHelper(offset: Int): DateHelper = new DateHelper(offset)
}

object DaysDSL extends App {
  import DateHelper._

  println(2 days ago)
  println(5 days from_now)

}

// 3.隐式类

object DateUtil {
  val ago = "ago"
  val from_now = "from_now"

  implicit class DateHelperImplicitClass(offset: Int) {
    def days(when: String): LocalDate = {
      val today = LocalDate.now
      when match {
        case "ago" => today.minusDays(offset)
        case "from_now" => today.plusDays(offset)
        case _ => today
      }
    }
  }
}

object DaysDSL2 extends App {
  import DateUtil._

  println(2 days ago)
  println(5 days from_now)
}