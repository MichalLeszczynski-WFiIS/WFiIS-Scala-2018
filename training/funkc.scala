object funkc {

    def printfmt(
                  tr: String => String
                  , str: String* ) {
      for ( a <- str)
        println(tr(a))
    }
    def main(args: Array[String])  = {
      printfmt("--"+_+"--", "Hello", "there", "people" );
    }
}
