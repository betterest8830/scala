package chapter07

object Test15_WordCount {
  def main(args: Array[String]): Unit = {

    /*
    val stringList = List("Hello Scala Hbase kafka", "Hello Scala Hbase", "Hello Scala", "Hello")
    val wordList = stringList.flatMap(_.split(" "))
    println(wordList)

    val wordMap = wordList.groupBy(word=>word) // 不能简化为 _
    println(wordMap)

    val wordMapCount = wordMap.map(tuple => (tuple._1, tuple._2.length))
    println(wordMapCount)

    val wordListCount = wordMapCount.toList
    println(wordListCount)

    val sortList = wordListCount.sortWith((left, right) => {left._2} > right._2)
    println(sortList)

    val resultList = sortList.take(3)
    println(resultList)
    */

    //复杂版本
    // 方式一，不推荐
    val tupleList = List(("Hello Scala Spark World ", 4), ("Hello Scala Spark", 3), ("Hello Scala", 2), ("Hello", 1))

    val stringList = tupleList.map(t=>(t._1.trim + " ") * t._2)
    println(stringList)

    val resultList = stringList.
      flatMap(_.split(" "))
      .groupBy(word=>word)
      .map(tuple => (tuple._1, tuple._2.length))
      .toList
      .sortBy(_._2)(Ordering[Int].reverse)
      .take(3)

    println(resultList)

    // 方式二，
    val wordCountList = tupleList.flatMap(t => {
      val strings = t._1.split(" ")
      strings.map(word=>(word, t._2))
    })
    println(wordCountList)

    val wordToTupleMap = wordCountList.groupBy(t=>t._1)
    println(wordToTupleMap)

    val stringToInts = wordToTupleMap.mapValues{
      datas => datas.map(_._2).sum
    }
    println(stringToInts)

    println(stringToInts.toList.sortWith(_._2 >_._2).take(3))
  }
}
