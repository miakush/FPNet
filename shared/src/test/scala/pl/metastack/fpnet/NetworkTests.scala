package pl.metastack.fpnet

import org.scalatest._

class NetworkTests extends FreeSpec with Matchers {
  "A Layer" - {
    "linear layer" ignore {
      val linear = Linear().inputSize(3).outputSize(1)
      val state = linear.state()
      val output = linear.forward(Tensor.vector(1, 2, 3), state)
      assert(output == Tensor.vector(0))
    }
  }

  "A Network" - {
    "with one layer" in {
      val net = Network()
        .inputSize(10)
        .addLayer(Linear().outputSize(5))
    }
  }
}