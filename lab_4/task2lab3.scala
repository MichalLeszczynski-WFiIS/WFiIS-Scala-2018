object task2lab3 {
  def distance(a: (Int,Int) ): Int = (a._1-a._2).abs
  def closest(numbers: Int *): (Int, Int) =closest(numbers.toArray.sorted)
  @scala.annotation.tailrec def closest(numbers: Array[Int], minPair: (Int,Int) = (Int.MinValue, Int.MaxValue)): (Int, Int) = {
    if(numbers.tail.isEmpty)
      minPair
      else
      if(distance(numbers(0), numbers(1))<distance(minPair))
      closest(numbers.tail,(numbers(0),numbers(1)))
      else
      closest(numbers.tail,minPair)
  }

  def main(args: Array[String]): Unit = {
val c = closest(1, 17, 8, 27, 21, 29, 99, 22, 4)
    println("" + c._1 + " " + c._2)



  }
}
