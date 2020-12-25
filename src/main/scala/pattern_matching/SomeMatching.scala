package pattern_matching

object SomeMatching {

  def main(args: Array[String]): Unit = {
    println(optionsPatternMatching(Some("123")))
    println(optionsPatternMatching(None))
  }

  def optionsPatternMatching(option: Option[String]): String = {
    option match {
      case Some(value) => s"I'm not an empty option. Value $value"
      case None => "I'm an empty option"
    }
  }

}
