package kata
import mainargs.{main, ParserForMethods}

object Kata {
  def addOne(i: Int) = i + 1

  @main
  def main(args: Array[String]) = {
    println(s"1 + 1 = ${addOne(1)}")
  }
}
