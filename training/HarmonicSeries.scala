package scala.math


object HarmonicSeries {

    def main(args: Array[String]): Unit = {

      def sumfrac(base: Int, precision: Double, powerNumber: Double = 1 ): Double = {

        val currentFraction = (1.0 / pow(base.toDouble, powerNumber)).toDouble
        println(currentFraction + " ")
        if (currentFraction < precision)
          0
        else
          currentFraction + sumfrac(base, precision, powerNumber + 1)
      }


      val sum1 = sumfrac(2, 1e-3 )
      val sum2 = sumfrac(5, 1e-9 )
      println(sum1)
      println(sum2)
    }



}
