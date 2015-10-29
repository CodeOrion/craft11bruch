import scala.annotation.tailrec

object Fraction {
  def of(nominator: Int, denominator: Int): Fraction = {
    val divisor = gcd(nominator, denominator)
    Fraction(nominator / divisor, denominator / divisor)
  }
  @tailrec
  private def gcd(a: Int, b: Int): Int = {
    if (b == 0)
      a
    else
      gcd(b, a % b)
  }
}
case class Fraction(nominator: Int, denominator: Int) {
  val g = Fraction.gcd(nominator, denominator)
  private val n = nominator/g
  private val d = denominator / g

  def +(other: Fraction): Fraction =
    Fraction.of(nominator*other.denominator + other.nominator*denominator, denominator*other.denominator)

}
