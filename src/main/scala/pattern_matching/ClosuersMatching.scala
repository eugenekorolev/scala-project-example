package pattern_matching

object ClosuersMatching {

  def main(args: Array[String]): Unit = {

    println(closuresPatternMatching(List("apple", 42, 4, 2)))

  }
  def closuresPatternMatching(list: List[Any]): List[Any] = {

    list.collect { case i: Int if (i < 10) => i }

  }
}
