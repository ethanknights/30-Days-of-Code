object Solution {
    def main(args: Array[String]) = {
        val i = 4
        val d = 4.0
        val s = "HackerRank "

		// Read values of another integer, double, and string variables
        // Note use scala.io.StdIn to read from stdin
        val myInt = scala.io.StdIn.readInt
        val myFloat = scala.io.StdIn.readDouble
        val myString = scala.io.StdIn.readLine

        // Print the sum of both the integer variables 
        val sumInt = i + myInt
        println(sumInt)

        // Print the sum of both the double variables
        val sumFloat = d + myFloat
        println(sumFloat)

        // Concatenate and print the string variables
        // The 's' variable above should be printed first.
        println(s"$s$myString")
    }
}
