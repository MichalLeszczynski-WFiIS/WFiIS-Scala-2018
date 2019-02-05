object task2lab7 {


  def main(args: Array[String]): Unit = {

    class TDist (val t: Int) {
      def tDistance: Int = t
    }


    class H(val d: Int) extends TDist(d) with HumanComps{}

    trait HumanComps {
      def tDistance: Int
      def human: String = {
        if(tDistance < 5) "now"
        else if(tDistance < 10) "about now"
        else if(tDistance < 21) "a moment ago"
        else "long ago"
      }


            def now(): Boolean = tDistance<5
            def aboutNow(): Boolean = tDistance < 10
            def momentAgo(): Boolean = tDistance < 20

    }


    val x = new H(0)
    println(x.human)
    val y = new H(8)
    println( y.human)
    val z = new H(15)
    println(z.human)
    println( ""+z.now() + " " + z.aboutNow() + " " + z.momentAgo() )




    class TPeriod ( val start: Int, val stop: Int) {
      def tDistance = stop-start
    }

    val h1 = new TPeriod(100,120) with HumanComps
    println( h1.human)

  }
}
