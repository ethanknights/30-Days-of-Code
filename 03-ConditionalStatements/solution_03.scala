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
        val N = StdIn.readLine.trim.toInt

        if N % 2 == 0 then
           
            if N >= 2 && N <= 5 then
                println("Not Weird")
                
            else if N >= 6 && N <= 20 then
                println("Weird")
                
            else if N > 20 then
                println("Not Weird")
            
        else
            println("Weird")
    }
}
