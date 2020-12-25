package pattern_matching


object RegexMatching {

  def main(args: Array[String]): Unit = {
    println(regexPatterns("1234"))
    println(regexPatterns("tobeornottobe"))
    println(regexPatterns("Welcome to city 25"))
    println(regexPatterns("-1_3"))
  }

  def regexPatterns(toMatch: String): String = {
    val numeric = """([0-9]+)""".r
    val alphabetic = """([a-zA-Z]+)""".r
    val alphanumeric = """([a-zA-Z0-9]+)""".r

    toMatch match {
      case numeric(value) => s"I'm a numeric with value $value"
      case alphabetic(value) => s"I'm an alphabetic with value $value"
      case alphanumeric(value) => s"I'm an alphanumeric with value $value"
      case _ => s"I contain other characters than alphanumerics. My value $toMatch"
    }
  }

}
