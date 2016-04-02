package pl.metastack.fpnet.activation

object Sigmoid extends Activation {
  def apply(x: Double): Double = 1 / (1 + Math.exp(-x))
  def backProp(x: Double): Double = apply(x) * (1 - apply(x))
}
