package kata

import org.scalatest.flatspec.AnyFlatSpec
class KataTests extends AnyFlatSpec {
  "Addition of 3 and 3" should "have result 6" in {
    assert(Kata.addOne(1) == 2)
  }
}