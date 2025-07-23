package kata

import utest._

object KataTests extends TestSuite {
  def tests = Tests {
    test("1 + 1 = 2") {
      val result = Kata.addOne(1)
      assert(result == 2)
    }
  }
}
