package pl.metastack.fpnet

import org.scalatest._
import pl.metastack.fpnet.activation.Sigmoid

class ActivationTests extends FreeSpec with Matchers {
  "Activation" - {
    "sigmoid" in {
      assert(Sigmoid(0) == 0.5)
      assert(Sigmoid(6) > 0.9)
    }
  }
}
