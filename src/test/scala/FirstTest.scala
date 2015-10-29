import org.specs2.mutable.Specification

class FirstTest extends Specification {

  "A Test should" should {
    "run" in {
      1 must be equalTo 2
    }
  }
}
