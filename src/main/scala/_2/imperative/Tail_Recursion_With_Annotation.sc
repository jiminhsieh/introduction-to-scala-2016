import scala.annotation.tailrec

def factorial(n: Int): BigInt = {
  @tailrec
  def helpFunction(acc: BigInt, n: Int): BigInt = {
    if (n == 0)
      acc
    else
      helpFunction(acc * n, n - 1)
  }
  helpFunction(1, n)
}