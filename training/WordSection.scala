object WordSection {

  object Sentences {
    def unapply(str: String): Option[(String, String, String, Any)] = {
      val arr = str.split("([!?.]) ").toList
      Some(arr.head, arr(1), arr(2), arr(3))
    }
  }


  def main(args: Array[String]): Unit = {

    val text = "Hello Marry! How are you today? I have seen  you yesterday in the sample place. What are you doing here?"



 val Sentences(s1, s2, s3, s4) = text
     println(s1)
    println(s2)
    println(s3)


  }
}