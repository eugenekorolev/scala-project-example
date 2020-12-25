package pattern_matching

case object SequnceMatching{

  def main(args: Array[String]): Unit = {
    println(sequencesPatternMatching(Seq("apple")))
    println(sequencesPatternMatching(Seq("apple", "banana", "orange")))
    println(sequencesPatternMatching(Vector("apple", "banana", "orange")))
    println(sequencesPatternMatching(Set("apple", "banana", "orange")))
  }

  def sequencesPatternMatching(sequence: Any): String = {
    sequence match {
      case List(singleElement) => s"I'm a list with one element: $singleElement"
      case List(_, _*) => s"I'm a list with one or multiple elements: $sequence"
      case Vector(1, 2, _*) => s"I'm a vector: $sequence"
      case _ => s"I'm an unrecognized sequence. My value: $sequence"
    }
  }
}
