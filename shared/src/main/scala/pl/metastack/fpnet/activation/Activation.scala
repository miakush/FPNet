package pl.metastack.fpnet.activation

trait Activation {
  def apply(x: Double): Double
  def backProp(x: Double): Double
}
