import scala.util.Random

object funkc {




  def main(args: Array[String])  = {

      def distanceFromZero(point: (Double, Double) ): Double =
      Math.sqrt(point._1 * point._1 + point._2 * point._2 )

    val generator = new Random()
    def rand(): Double = generator.nextDouble()
    def BelongsToCircle(point: (Double, Double)): Boolean = distanceFromZero(point)<1
    def randomPointBelongsToCircle(): Boolean = {
          val point = (rand,rand)
          BelongsToCircle(point)
        }

    val allPoints = 10000
    var pointsInside = 0


      for (i<-1 until allPoints){
         if(randomPointBelongsToCircle) pointsInside+=1
        }

      val ratio = pointsInside.toDouble/allPoints
      val pi = 4.0 * ratio
    println(pi)

    }
}
