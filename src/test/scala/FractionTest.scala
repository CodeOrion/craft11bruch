import org.specs2.mutable.Specification

class FractionTest extends Specification{

  "A Fraction" should {
    "add with same denominator" in {
      Fraction.of(1, 3) + Fraction.of(1, 3) must be equalTo Fraction.of(2, 3)
    }
    "Add with different denominator" in {
      Fraction.of(1, 3) + Fraction.of(1, 4) must be equalTo Fraction.of(7, 12)
    }
  }
}
