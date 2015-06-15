package uti.math


import org.scalatest.FunSuite
import uti.math.Stats._

import Numeric._


  class StatsTest extends FunSuite {


    test("Arithmetic mean") {
      val Data = List(
        (0,              List(0,0,0)),
        (2,              List(2)),
        (2.5,            List(1,2,3,4))
        //(2.5,            List(1.0,2.0,3.0,4.0))
      )

      for ((expected, values) <- Data) {
        assertResult(expected, "Arithmetic mean of " + values) {
          mean(values: _*)
        }
      }
    }

  }
