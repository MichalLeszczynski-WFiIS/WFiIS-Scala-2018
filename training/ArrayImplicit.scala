object ArrayImplicit {

  implicit def toArray(x: Int): Array[Int] = Array.ofDim[Int](x)

  object Int {
    def *(x: Int): Array[Int] = x
  }

// implicit def *(t: Int,x: Int): Array.ofDim[Int](x)


  def main(args: Array[String]): Unit = {
    val x = Int * 5
    println(x.getClass.getSimpleName + x.mkString(" "))
    // expected output  int[]0 0 0 0 0

  }

}