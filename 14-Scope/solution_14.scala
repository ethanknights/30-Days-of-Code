// Calculate & display the max absolute difference of an immutable sequence.
// Task requires using a Difference class, that applies a 'computeDifference' method. 

import scala.io.StdIn.readLine

class Difference(a: Seq[Int]) {
    private val elements: Seq[Int] = a
    private val elementsSize: Int = elements.length
    var maximumDifference: Option[Int] = None

    def computeDifference(): Unit = {
        var maxDiff = 0
            for (i <- 0 until elementsSize) {
                for (j <- 0 until elementsSize) {
                      val currentDifference = scala.math.abs(elements(i) - elements(j))
                      if (currentDifference > maxDiff) {
                          maxDiff = currentDifference
                      }
                  }
              }
          maximumDifference = Some(maxDiff)
      }
}

object Solution {
    def main(args: Array[String]): Unit = {
        readLine() // discard the first input line as in py
        val a = readLine().split(" ").map(_.toInt)

        val d = new Difference(a)
        d.computeDifference()

        println(d.maximumDifference.get)
    }
}
