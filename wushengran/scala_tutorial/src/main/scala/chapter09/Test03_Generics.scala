package chapter09

object Test03_Generics {
  def main(args: Array[String]): Unit = {

    val child: Parent = new Child

    // 逆变和协变
    val childList1 : MyCollection1[Parent] = new MyCollection1[Child]
    val childList2 : MyCollection2[SubChild] = new MyCollection2[Child]

    //上下线
    def test[A <: Child](a: A) ={
      println(a.getClass.getName)
    }

    test[Child](new Child())
    test[Child](new SubChild())
    //test[SubChild](new Child()) error

  }
}

class Parent{}

class Child extends Parent{}

class SubChild extends Child {}

class MyCollection1[+E] {}
class MyCollection2[-E] {}