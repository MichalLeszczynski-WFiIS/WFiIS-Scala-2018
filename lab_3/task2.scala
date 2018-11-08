import scala.util.Random

object task2 {

  def distance(m1: (Int, Int) ,m2: (Int, Int)): Double = Math.sqrt(((m1._1 - m2._1) * (m1._1 - m2._1) +  (m1._2 - m2._2) * (m1._2 - m2._2)).toDouble )

//  def forAll(punkty: Array[(Int,Int)](10)) Unit ={
//
//    for(i<- 1 until 10){
//      println(i + ". " + distance(punkty(i),punkty(i+1)).toString)
//      }

  def main(args: Array[String]): Unit = {

    var r = scala.util.Random
   //val punkt = (r.nextInt(10)+1,r.nextInt(10)+1)

    val miejsca = new Array[(Int,Int)](10)

    for(i <- 1 until 10 ){
      miejsca.update(i,(r.nextInt(10)+1,r.nextInt(10)+1))
      print(i + "." + miejsca(i).toString + " ")
    }
    println()
//     forAll(miejsca)

  }
}