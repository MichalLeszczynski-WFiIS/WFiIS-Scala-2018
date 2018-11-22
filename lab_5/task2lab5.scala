object task2lab5 {


  def checkThatWeUnderstand(str: String)(sentence: Boolean): Boolean = {
    if(sentence) {println("Yes we do understand " + str)}
    else println("No, we do NOT understand " + str)
    sentence
  }


  def main(args: Array[String]): Unit = {



    checkThatWeUnderstand("String operations") {
      checkThatWeUnderstand("concatenation"){
        val s1 = "Hi "
        val s2 = "Res"
        val s3 = s1 + s2
        s3 == "Hi Res"
      } && checkThatWeUnderstand("indexing") {
        "Eva" (0) == 'E' && "Eva" (2) == 'a'
      } && checkThatWeUnderstand("multiplication") {
        "Eva"*2 == "Eva2"
      }
    }


  }
}
