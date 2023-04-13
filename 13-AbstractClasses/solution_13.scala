// Create & display a new_novel by constructing from an abstract Book class

abstract class Book(val title: String, val author: String) {
    def display(): Unit
  }

class MyBook(title: String, author: String, val price: Int) extends Book(title, author) {
    def display(): Unit = {
      println("Title: " + title)
      println("Author: " + author)
      println("Price: " + price.toString)
    }
}

object Solution {
    def main(args: Array[String]): Unit = {
    val title = scala.io.StdIn.readLine()
    val author = scala.io.StdIn.readLine()
    val price = scala.io.StdIn.readInt()

    val new_novel = new MyBook(title, author, price)
    new_novel.display()
    }
}
