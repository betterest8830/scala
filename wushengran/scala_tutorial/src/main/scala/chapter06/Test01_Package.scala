// 用嵌套风格创建包

package com{

  import com.atguigu.scala.Inner

  object Outer{
    var out: String = "out"

    def main(args: Array[String]): Unit = {
      println(Inner.in)
      println(name)
    }
  }
  package atguigu{
    package scala{
      object Inner{
        val in: String = "int"

        def main(args: Array[String]): Unit = {
          Outer.out = "outer"
          println(Outer.out)
        }
      }
    }
  }
}

package object com{
  val name: String = "com"
}