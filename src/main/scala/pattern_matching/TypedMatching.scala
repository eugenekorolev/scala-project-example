package pattern_matching

object TypedMatching {

  def main(args: Array[String]): Unit = {
    println(typedPatternMatching("myTuple"))
    println(typedPatternMatching(42))
    println(typedPatternMatching(43d))
  }

  def typedPatternMatching(any: Any): String = {
    any match {
      case string: String => s"I'm a string. My value: $string"
      case integer: Int => s"I'm an integer. My value: $integer"
      case _ => s"I'm from an unknown type. My value: $any"
    }
  }
}
