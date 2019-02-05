object task3lab7 {


    def main(args: Array[String]): Unit = {


      class TDist(val t: Int) {
        def tDistance: Int = t
      }

      class H( val d: Int ) extends  TDist(d) with HumanComps{}

      class TPeriod ( val start: Int, val stop: Int ) {
        def tDistance: Int =  stop - start
      }

      trait HumanComps {
        def tDistance: Int
        def human: String = {

          var word = "now"
          if (aboutNow()) word = "about now"
          else if (momentAgo()) word = "a moment ago"
          word
        }
        def aboutNow(): Boolean = tDistance > 0 && tDistance <= 10
        def momentAgo(): Boolean =tDistance > 10
        def now(): Boolean = tDistance == 0
      }

      val x = new H(0)
      println( x.human )
      val y = new H(8)
      println( y.human )
      val z = new H(15)
      println( z.human )
      println( ""+z.now() + " " + z.aboutNow() + " " + z.momentAgo())

      val h1 = new TPeriod(100, 120) with HumanComps
      println( h1.human )
    }


}
