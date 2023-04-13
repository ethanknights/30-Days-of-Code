// Display the integer value of a given string. 
// Include an exception 'Bad String' if the str_to_int operation is not possible.

import scala.util.Try

object Solution {
    def main(args: Array[String]): Unit = {
    val s = scala.io.StdIn.readLine()
    val result = Try(s.toInt).getOrElse("Bad String")
    println(result)
    }
}
