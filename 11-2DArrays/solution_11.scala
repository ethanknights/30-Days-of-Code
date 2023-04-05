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


import scala.io.StdIn

object Solution {
  def main(args: Array[String]): Unit = {
    val arr = Array.ofDim[Int](6, 6)
    for (i <- 0 until 6) {
      arr(i) = scala.io.StdIn.readLine.split(" ").map(_.toInt)
    }

    val hourglasses = for {
      i <- 0 until 4
      j <- 0 until 4
    } yield {
      val top = arr(i).slice(j, j + 3).sum
      val middle = arr(i + 1)(j + 1)
      val bottom = arr(i + 2).slice(j, j + 3).sum
      top + middle + bottom
    }

    val maxSum = hourglasses.max
    println(maxSum)
  }
}
