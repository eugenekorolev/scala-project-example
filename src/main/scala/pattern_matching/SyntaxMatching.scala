package pattern_matching

object SyntaxMatching {

  def main(args: Array[String]): Unit = {
    println(patternMatching("One"))
    println(patternMatching("Two"))
    println(patternMatching("One1"))
  }

  def patternMatching(candidate: String): Int = {
    candidate match {
      case "One" => 1
      case "Two" => 2
      case _ => -1
    }
  }
}
