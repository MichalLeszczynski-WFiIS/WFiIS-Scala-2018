object proba5 {

  def main(args: Array[String]):Unit  = {
    def eightAndSq(i: Int)= (i*8, i*i)

    def humanComp(i: Int, j: Int)= if (i>j) "greater than " else "less than "
    for ( x <- 0 to 10) {
      val (e,s) = eightAndSq(x)
      println(x.toString + " mul eight siema a " +humanComp(e,s) + x.toString+" sq")
    }
  }


}
