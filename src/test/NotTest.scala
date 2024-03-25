package rgTest

import chiseltest._
import org.scalatest.flatspec.AnyFlatSpec

class NotTest extends AnyFlatSpec with ChiselScalatestTester {
  "not" should "invert the input" in {
    test(new not) { dut =>
      dut.io.input.poke(1.U)
      assert(dut.io.output.litValue() === 0.U)

      dut.io.input.poke(0.U)
      assert(dut.io.output.litValue() === 1.U)
    }
  }
}
