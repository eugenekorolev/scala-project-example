package pattern_matching


object MatchExpression {

  def main(args: Array[String]): Unit = {
    println(caseClassesPatternMatching(new Mammal("Fish", true)))
    println(caseClassesPatternMatching(new Mammal("Bird", false)))
    println(caseClassesPatternMatching(new Mammal("Human", true)))
  }

  def caseClassesPatternMatching(animal: Animal): String = {
    animal match {
      case Mammal(name, fromSea) => s"I'm a $name, a kind of mammal. Am I from the sea? $fromSea"
      case Bird(name) => s"I'm a $name, a kind of bird"
      case _ => "I'm an unknown animal"
    }
  }

  abstract class Animal

  case class Mammal(name: String, fromSea: Boolean) extends Animal

  case class Bird(name: String) extends Animal

  case class Fish(name: String) extends Animal

}