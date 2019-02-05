
object task1lab9 {

  object Sentences {
    def unapplySeq(str: String): Option[Array[String]] = {
      if(str.contains('.') || str.contains('!') || str.contains('?'))
      Some(str.split("[.!?] "))
      else
        None
    }
  }


  def main(args: Array[String]): Unit = {

    val text = "Hello Marry! How are you today? I have seen  you yesterday in the sample place. What are you doing here?"
    val tex = "How are you"

    val Sentences(s1, s2, s3, _*) = text
    println(s1)
    println(s2)
    println(s3)


  }
}
