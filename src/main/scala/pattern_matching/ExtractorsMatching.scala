package pattern_matching

object ExtractorsMatching {

  def main(args: Array[String]): Unit = {
    println(extractors(new String("John Smith")))

  }
  object Person {
    def apply(fullName: String) = fullName

    def unapply(fullName: String): Option[String] = {
      if (!fullName.isEmpty)
        Some(fullName.replaceAll("(?<=\\w)(\\w+)", "."))
      else
        None
    }
  }

  def extractors(person: Any): String = {
    person match {
      case Person(initials) => s"My initials are $initials"
      case _ => "Could not extract initials"
    }
  }
}
