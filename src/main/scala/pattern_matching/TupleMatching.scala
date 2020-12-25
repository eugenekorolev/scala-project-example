package pattern_matching

object TupleMatching {

  val myTuple = new Tuple2(2, 1)
  val myTuple2 = Tuple3(2, 1, 3)
  val myTuple3 = (2, 1, 3, 4)

  def main(args: Array[String]): Unit = {
    println(tuplesPatternMatching(myTuple))
    println(tuplesPatternMatching(myTuple2))
    println(tuplesPatternMatching(myTuple3))
  }

  def tuplesPatternMatching(tuple: Any): String = {
    tuple match {
      case (first, second) => s"I'm a tuple with two elements: $first & $second"
      case (first, second, third) => s"I'm a tuple with three elements: $first & $second & $third"
      case _ => s"Unrecognized pattern. My value: $tuple"
    }
  }

}
