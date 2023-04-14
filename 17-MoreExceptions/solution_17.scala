// Create a Calculator class with a power method.
// Include an exception 'Expecting positive n & p' if inputs are not positive.

import scala.io.StdIn.readLine

object Calculator {
    def main(args: Array[String]): Unit = {
        val myCalculator = new Calculator
        val T = readLine().toInt
        for (i <- 1 to T) {
            val Array(n, p) = readLine().split(" ").map(_.toInt)
            try {
                val ans = myCalculator.power(n, p)
                println(ans)
            } catch {
                case e: Exception => println(e.getMessage)
            }
        }
    }
}

class Calculator {
    def power(n: Int, p: Int): Int = {
        if (n < 0 || p < 0) {
            throw new Exception("Expecting positive n & p")
        }
        val ans = math.pow(n, p).toInt
        ans
    }
}
