package pattern_matching

import pattern_matching.SealedMatching.CardSuit

object SealedMatching {

  sealed abstract class CardSuit

  case class Spike() extends CardSuit

  case class Diamond() extends CardSuit

  case class Heart() extends CardSuit

  case class Club() extends CardSuit

  def main(args: Array[String]): Unit = {
    println(sealedClass(new Spike))
    println(sealedClass(new Club))
    println(sealedClass(new Heart))
    println(sealedClass(new Diamond))
  }

  def sealedClass(cardSuit: CardSuit): String = {
    cardSuit match {
      case Spike() => "Card is spike"
      case Club() => "Card is club"
      case Heart() => "Card is heart"
      case Diamond() => "Card is diamond"
    }
  }
}
