object Nbonnaci {
  def main(args: Array[String]): Unit = {
    val N = 3

    def bonnaciN(wordCount: Int): Int = {
      if (wordCount <= N) 1 else {
        var sum = 0
        for (i <- 1 to N) sum+= bonnaciN(wordCount - i)
        sum
      }
    }

    for (i <- N to 20 by N) {
      println
      (N to 1 by -1).foreach(j => print(f"${bonnaciN(i - j + 1)}%10s" + "\t"))
    }

  }
}
