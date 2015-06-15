package uti.math

//import scala.math

object Stats {






  /**
   * Simple arithmetic mean
   *
   * @param it(s) to be meaned
   *
   * @return arithmetic mean
   */
  def mean[T](it:T*)(implicit n:Numeric[T]) = {
    it.map(n.toDouble).sum / it.size
  }

  //what about?
  //def mean[T](items: T*)(implicit n: Fractional[T]) = n.div(items.sum, n.fromInt(items.size))


}
