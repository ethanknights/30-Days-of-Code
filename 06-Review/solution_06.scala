import java.io._
import java.math._
import java.security._
import java.text._
import java.util._
import java.util.concurrent._
import java.util.function._
import java.util.regex._
import java.util.stream._
import scala.collection.immutable._
import scala.collection.mutable._
import scala.collection.concurrent._
import scala.concurrent._
import scala.io._
import scala.math._
import scala.sys._
import scala.util.matching._
import scala.reflect._


object Solution {

    def main(args: Array[String]) = {
        var n = scala.io.StdIn.readInt()
        for(i <- 1 to n){

            var myString = scala.io.StdIn.readLine()
            var evenString =    myString.sliding(1,2).mkString("")
            var oddString =     myString.tail.sliding(1,2).mkString("")
            println(evenString + " " + oddString)

            // V2. Prints vector (not quite)
            // println( (0 until myString.length by 2).map(i => myString(i)) )
            // println( (1 until myString.length by 2).map(i => myString(i)) )
        }
    }
}