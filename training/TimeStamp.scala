

object TimeStamp {

  class Logger{
    def pprint(str: String): Unit = println(str)
  }

  trait Quote extends Logger{

    abstract override def pprint(str: String): Unit = super.pprint("\"" + str + "\"")
  }

  trait TimeStamp extends Logger{
    val today ="24.11.1998"
    abstract override def pprint(str: String): Unit = {print(today + " ");super.pprint(str)}
  }



  def main(args: Array[String]): Unit = {
  //  val today ="24.11.1998"


    val l = new Logger with Quote with TimeStamp
    l.pprint("Hello World")
    println("")
    val ql = new Logger with Quote
    ql.pprint("No date, just quote")
    println("")
    val tl = new Logger with TimeStamp
    tl.pprint("Some time stamped message")
    println("")
    val plain = new Logger
    plain.pprint("Just he text")
    println("")
  }
}
