import Math.{pow, round}
import scala.collection.immutable.IndexedSeq

object Fibonacci {
  def main(args: Array[String]) {
    println(fibonacci_phi(10))
  }

  def fibonacci_phi(n: Int): IndexedSeq[Long] = {
    val Phi = 1.6180339887
    (1 to n ) map { x => round(Math.pow(Phi,x) / ( Phi + 2)) }
  }
}
