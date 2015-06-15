package uti.math

//import scala.math

object Stats {



  /**
   * Simple arithmetic mean
   *
   * @param items to be meaned
   *
   * @return arithmetic mean
   */
  def mean[T](items: T*)(implicit n: Numeric[T]): Double = {

    items.length match {
      case 0 => throw new IllegalArgumentException("Can't calculate the mean of 0 elements")
      case 1 => n.toDouble(items(0))
      case _ => ((0.0 /: items) ((a, b) => a + n.toDouble(b))) / items.length
    }
  }

}
