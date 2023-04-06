// Define Person class that is extended with Student class.
// The Student class allows printing their grade score as a char category.
// PS. No scala option on webapp currently!

object Solution {

  class Person(val firstName: String, val lastName: String, val idNumber: Int) {
    def printPerson() = {
      println("Name: " + lastName + ", " + firstName)
      println("ID: " + idNumber)
    }
  }

  class Student(firstName: String, lastName: String, idNumber: Int, scores: Array[Int]) extends Person(firstName, lastName, idNumber) {
    def calculate(): Char = {
      val totalScore = scores.sum
      val gradeScore = totalScore.toDouble / scores.length

      if (gradeScore >= 90) 'O'
      else if (gradeScore >= 80) 'E'
      else if (gradeScore >= 70) 'A'
      else if (gradeScore >= 55) 'P'
      else if (gradeScore >= 40) 'D'
      else 'T'
    }
  }

  def main(args: Array[String]): Unit = {
    val input = scala.io.Source.stdin.getLines().toList
    // In lieu of webapp, try: val input = scala.io.Source.fromFile("sample_input.txt").getLines().toList
    val firstName = input(0)
    val lastName = input(1)
    val idNumber = input(2).toInt
    val scores = input(4).split(" ").map(_.toInt)

    val student = new Student(firstName, lastName, idNumber, scores)
    student.printPerson()
    println("Grade: " + student.calculate())
  }
}
