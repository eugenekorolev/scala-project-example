package pattern_matching

object CatchMatching {

  def main(args: Array[String]): Unit = {

    println(catchBlocksPatternMatching(new IllegalArgumentException))
    println(catchBlocksPatternMatching(new RuntimeException))
  }

  def catchBlocksPatternMatching(exception: Exception): String = {
    try {
      throw exception
    } catch {
      case ex: IllegalArgumentException => "It's an IllegalArgumentException"
      case ex: RuntimeException => "It's a RuntimeException"
      case _ => "It's an unknown kind of exception"
    }
  }

}
