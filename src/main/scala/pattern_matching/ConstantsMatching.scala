package pattern_matching

object ConstantsMatching {
  def main(args: Array[String]): Unit = {
    println(constantsPatternMatching(0))
    println(constantsPatternMatching(4.5d))
    println(constantsPatternMatching(false))
    println(constantsPatternMatching("test"))
  }

  def constantsPatternMatching(constant: Any): String = {
    constant match {
      case 0 => "I'm equal to zero"
      case 4.5d => "I'm a double"
      case false => "I'm the contrary of true"
      case _ => s"I'm unknown and equal to $constant"
    }
  }

}
