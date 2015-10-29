import org.specs2.mutable.Specification

class FractionTest extends Specification{

  "A Fraction" should {
    "add with same denominator" in {
      Fraction(1, 3) + Fraction(1, 3) must be equalTo Fraction(2, 3)
    }
    "Add with different denominator" in {
      Fraction(1, 3) + Fraction(1, 4) must be equalTo Fraction(7, 12)
    }
  }
}
