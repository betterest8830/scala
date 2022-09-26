package chapter07

object Test20_Parallel {
  def main(args: Array[String]): Unit = {

    val results = (1 to 10).map(
      x => Thread.currentThread().getId
    )
    println(results)

    val parSeq = (1 to 10).par.map(
      x => Thread.currentThread().getId
    )
    val results2 = parSeq
    println(results2)

  }
}
