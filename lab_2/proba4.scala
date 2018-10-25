object proba4 {
  def main(args: Array[String])  = {
    def eightAndSq(i: Int)= (i*8, i*i)

    def humanComp(i: Int, j: Int)= if (i>j) "greater than " else "less than "
    for ( x <- 0 to 10) {
      val (e,s) = eightAndSq(x)
      println(x.toString + " mul eight " +humanComp(e,s) + x.toString+" sq")
    }
  }

}
