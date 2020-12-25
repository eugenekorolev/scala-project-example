import scala.io.StdIn
import scala.util.{Failure, Success, Try}

object TryExamples{

  def main(args: Array[String]): Unit = {
    //divide
    divideOldStyle
  }

  def divide: Try[Int] = {
    val dividend = Try(StdIn.readLine("Enter an Int that you'd like to divide:\n").toInt)
    val divisor = Try(StdIn.readLine("Enter an Int that you'd like to divide by:\n").toInt)
    val problem = dividend.flatMap(x => divisor.map(y => x/y))
    problem match {
      case Success(v) =>
        println("Result of " + dividend.get + "/"+ divisor.get +" is: " + v)
        Success(v)
      case Failure(e) =>
        println("You must've divided by zero or entered something that's not an Int. Try again!")
        println("Info from the exception: " + e.getMessage)
        divide
    }
  }

  def divideOldStyle: Try[Int] = {

    try {
      val dividend = StdIn.readLine("Enter an Int that you'd like to divide:\n").toInt
      val divisor = StdIn.readLine("Enter an Int that you'd like to divide by:\n").toInt
      val result = dividend / divisor
      println("Result of " + dividend + "/"+ divisor +" is: " + result)
    } catch {
      case foo: NumberFormatException => {
        println("You must've divided by zero or entered something that's not an Int. Try again!")
        println("Info from the exception: " + foo.getMessage)
      }
    }
    divideOldStyle
  }

}
