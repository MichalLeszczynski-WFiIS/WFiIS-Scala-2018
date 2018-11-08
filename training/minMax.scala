object minMax {
  def main(args: Array[String]): Unit = {

    def minimum (a:Int, b:Int):Int = if(a<b) a else b
    def maximum (a:Int, b:Int):Int = if(a>b) a else b
    def findMinAndMax(arguments: List[Int]): (Int, Int) = if (arguments.tail.isEmpty) {
   (arguments.head, arguments.head)
      }
    else {
    val (tempmin, tempmax) = findMinAndMax(arguments.tail)
      (minimum(arguments.head, tempmin), maximum(arguments.head, tempmax))
        }
    println(findMinAndMax( List(1,3,4,5,2,9,4,5,-1,5,6,6) ))
  }
}
