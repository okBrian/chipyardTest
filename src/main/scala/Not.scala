package rgTest

import chisel3._
import chisel3.util._
import org.chipsalliance.cde.config.Parameters
import freechips.rocketchip.tile.{HasCoreParameters, LazyRoCC, LazyRoCCModuleImp, OpcodeSet}
import freechips.rocketchip.diplomacy.LazyModule

class not extends BlackBox with HasBlackBoxResource {
  val io = ( new Bundle {
    val input = Input(UInt(1.W))
    val out =   Input(UInt(1.W))
  })
 
  addResource("/vsrc/test.v")
}

class notAccel(opcodes: OpcodeSet)(implicit p: Parameters) extends LazyRoCC(opcodes = opcodes, nPTWPorts = 0) {
  override lazy val module = new notAccelImp(this)
}

class notAccelImp(outer: notAccel)(implicit p: Parameters) extends LazyRoCCModuleImp(outer) with HasCoreParameters {
  val notbb = Module(new not)
}