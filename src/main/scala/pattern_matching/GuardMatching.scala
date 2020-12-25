package pattern_matching

object GuardMatching {

  var numsTail = 1 :: (2 :: (3 :: (4 :: Nil)))

  def main(args: Array[String]): Unit = {
    println(patternGuards(numsTail, 4))
    println(patternGuards(numsTail, 3))
    println(patternGuards("numsTail", 8))
    println(patternGuards("numsTail", 7))
    println(patternGuards(42, 7))
  }

  def patternGuards(toMatch: Any, maxLength: Int): String = {
    toMatch match {
      case list: List[Any] if (list.size <= maxLength) => "List is of acceptable size"
      case list: List[Any] => "List has not an acceptable size"
      case string: String if (string.length <= maxLength) => "String is of acceptable size"
      case string: String => "String has not an acceptable size"
      case _ => "Input is neither a List nor a String"
    }
  }

}
