import scala.io.StdIn

object AdditionProgram {
  def main(args: Array[String]): Unit = {
    println("Enter two numbers:")
    val num1 = StdIn.readInt()
    val num2 = StdIn.readInt()

    println("Enter the operation: (1) Add, (2) Subtract, (3) Multiply, (4) Divide")
    val choice = StdIn.readInt()

    val result = choice match {
      case 1 => num1 + num2
      case 2 => num1 - num2
      case 3 => num1 * num2
      case 4 => num1.toDouble / num2.toDouble
      case _ => throw new IllegalArgumentException("Invalid choice")
    }

    println("Result: " + result)
  }
}