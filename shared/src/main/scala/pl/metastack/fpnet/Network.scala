package pl.metastack.fpnet

class Tensor

object Tensor {
  def vector(values: Int*): Tensor = new Tensor
  def matrix(values: Seq[Int]*): Tensor = new Tensor
}

trait Layer {
  def forward(tensor: Tensor, state: State): Tensor = ???
}

case class Linear() extends Layer {
  def state(): State = State()
  def inputSize(size: Int): Linear = this
  def outputSize(size: Int): Linear = this
}

case class State()

case class Abs() extends Layer

case class Tanh() extends Layer

// TODO Check that input and output sizes of layers are compatible
case class Network(layers: Seq[Layer] = Seq.empty) {
  def inputSize(size: Int): Network = this
  def addLayer(layer: Layer): Network = copy(layers = layers ++ Seq(layer))
}
