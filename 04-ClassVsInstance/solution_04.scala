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


class Person {

    var age: Int = 0

    def this(initialAge: Int) = {
        // Add some more code to run some checks on initialAge
        this()
        if (initialAge >= 0) this.age = initialAge
        else println("Age is not valid, setting age to 0.")
        }

    def amIOld(): Unit = {
        // Do some computations in here and print out the correct statement to the console
        if (this.age < 13) println("You are young.")
        else if (this.age >= 13 && this.age < 18) println("You are a teenager.")
        else println("You are old.")
        }

    def yearPasses(): Unit = {
        // Increment the age of the person in here
        this.age += 1
        }
}

object Solution {

    def main(args: Array[String]) = {
        var T = scala.io.StdIn.readInt()
        var i = 0
        for(i <- 1 to T){        
             var age=scala.io.StdIn.readInt()
             var p=new Person(age)
             p.amIOld()
             var j=0
             for(j <- 1 to 3){
                 p.yearPasses()
             }
             p.amIOld()
             System.out.println()

        }


    }
}