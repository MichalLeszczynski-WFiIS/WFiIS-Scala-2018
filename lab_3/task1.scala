object task1 {



  def print2DArr(tablica: Array[Array[Double]], digits: Int): Unit = {


    for (i <- 0 until tablica.size; j <- 0 until tablica.transpose.length) {
      print(tablica(i)(j).toString.padTo(10,'0').substring(0,digits+1))
      print(" ")

      if (j == tablica.size) {println()}
    }
    println()
  }
  def main(args: Array[String]): Unit = {
    val test = Array.ofDim[Double](4,5);
    for ( i <- 0 until 4; j <- 0 until 5) test(i)(j) = i.toDouble/(1+j).toDouble

    print2DArr( test, 4) // 4 digits
    print2DArr( test, 3) // 3 digits

  }

}
