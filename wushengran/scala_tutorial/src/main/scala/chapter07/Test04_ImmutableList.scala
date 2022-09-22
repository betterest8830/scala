package chapter07

object Test04_ImmutableList {
  def main(args: Array[String]): Unit = {
    // 不能用 new
    //val list = new List()
    val list = List(1,2,3,4)
    // 可以用 Nil 和 :: 创建 list
    println(list)
    println(list(1)) //根据 索引只能查找不能赋值

    val list1 = 1::2::3::Nil
    // 添加元素
    val list2 = list1.+:(10) // 在前面加
    val list4 = 10 +: list1
    val list3 = list1.:+(23) // 在后面加
    val list5 = list1 :+ 23
    println(list2)
    println(list4)
    println(list3)
    println(list5)
    val list6 = 5::6::7::list1 // ::运算规则从右向左
    println(list6)
    val list7 = list.::(7) //放在开头
    println(list7)

    val list8 = Nil.::(3).::(4).::(5)
    val list9 = 8::7::6::Nil
    println(list8)
    println(list9)
    println(list8::list9) // List(List(5, 4, 3), 8, 7, 6)
    println(list8:::list9) // 扁平化
    println(list8 ++ list9)

  }
}
