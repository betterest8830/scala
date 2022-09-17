package chapter05

object Test07_Practice_Collection {
  def main(args: Array[String]): Unit = {

    // 手动实现map 高阶函数
    def arrayOperation(array: Array[Int], op: Int => Int): Array[Int] = {
      for(elem <- array) yield op(elem)
    }

    val arr: Array[Int] = Array(12, 34, 55)

    def addOne(elem: Int): Int = {
      elem + 1
    }

    val newArray: Array[Int] = arrayOperation(arr, addOne)
    println(newArray.mkString(","))

    val newArray2: Array[Int] = arrayOperation(arr, _*2)
    println(newArray2.mkString(", "))

    // practice 01
    val fun = (i: Int, s: String, c: Char) => {if(i == 0 && s == "" && c== '0') false else true}
    println(fun(0, "", '0'))
    println(fun(0, "", '1'))

    // practice 02
    // String=>Char=>Boolean 等价于 String=>(Char=>Boolean)
    def func(i: Int) = {
      def f1(s: String) = {
        def f2(c: Char): Boolean = {
          if(i == 0 && s == "" && c== '0') false else true
        }
        f2 _
      }
      f1 _
    }
    println(func(0) ("") ('0'))
    println(func(0) ("") ('1'))

    // 优化为匿名函数简写（闭包）
    def func2(i: Int): String => (Char=>Boolean) = {
      s => c => if(i == 0 && s == "" && c== '0') false else true
    }

    println(func2(0) ("") ('0'))
    println(func2(0) ("") ('1'))

    //科里化
    def func3(i: Int)(s: String)(c: Char): Boolean = {
      if(i == 0 && s == "" && c== '0') false else true
    }
    println(func3(0) ("") ('0'))
    println(func3(0) ("") ('1'))


  }
}
