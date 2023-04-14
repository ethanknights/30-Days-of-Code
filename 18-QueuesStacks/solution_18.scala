import scala.io.StdIn.readLine

class Solution {
  private var stack: List[Char] = Nil
  private var queue: List[Char] = Nil

  def popCharacter(): Char = {
    val char = stack.head
    stack = stack.tail
    char
  }

  def pushCharacter(char: Char): Unit = {
    stack = char :: stack
  }

  def dequeueCharacter(): Char = {
    val char = queue.head
    queue = queue.tail
    char
  }

  def enqueueCharacter(char: Char): Unit = {
    queue = queue :+ char
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    // read the string s
    val s = readLine()
    // Create the Solution class object
    val obj = new Solution()

    val l = s.length
    // push/enqueue all the characters of string s to stack
    for (i <- 0 until l) {
      obj.pushCharacter(s(i))
      obj.enqueueCharacter(s(i))
    }

    var isPalindrome = true
    /*
    pop the top character from stack
    dequeue the first character from queue
    compare both the characters
    */
    for (i <- 0 until l / 2) {
      if (obj.popCharacter() != obj.dequeueCharacter()) {
        isPalindrome = false
      }
    }
    // finally print whether string s is palindrome or not.
    if (isPalindrome) {
      println("The word, " + s + ", is a palindrome.")
    } else {
      println("The word, " + s + ", is not a palindrome.")
    }
  }
}
