import scala.io.StdIn.readLine

abstract class AdvancedArithmetic {
  def divisorSum(n: Int): Int
}

class Calculator extends AdvancedArithmetic {
  def divisorSum(n: Int): Int = {
    val divisorList = for (i <- 1 to n if n % i == 0) yield i
    divisorList.sum
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    try {
      val input = readLine().trim
      if (input.isEmpty) throw new IllegalArgumentException("Input cannot be empty")
      val n = input.toInt
      val my_calculator = new Calculator()
      val s = my_calculator.divisorSum(n)
      println(s"I implemented: ${my_calculator.getClass.getInterfaces()(0).getSimpleName}")
      println(s)
    } catch {
      case e: IllegalArgumentException => println("Invalid input: " + e.getMessage)
      case e: Exception => println("An error occurred: " + e.getMessage)
    }
  }
}
