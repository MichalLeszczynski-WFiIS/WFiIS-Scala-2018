object task2lab6 {

  class STime(val h: Int =0,val m: Int =0,val s: Int = 0) {
    override def toString: String = h.toString + " h " + m + " m " + s + " s "

    def >(time: STime): Boolean = {
      if (h == time.h) {
      if (m == time.m) {
        if (s > time.s) true else false
      }
      else if (m > time.h) true else false
    }
    else if (h > time.h) true else false
  }

    def <(time: STime): Boolean = {
      if (h == time.h) {
        if (m == time.m) {
          if (s < time.s) true else false
        }
        else if (m < time.h) true else false
      }
      else if (h < time.h) true else false
    }

    def ==(time: STime): Boolean = if(h==time.h && m==time.m && s==time.s) true else false
    def !=(time: STime): Boolean = if(h!=time.h || m!=time.m || s!=time.s) true else false


    def moveBy(shift: Int )(unitt: =>Int): STime ={
     unitt match
      {
        case 1 => STime(h + shift, m, s)
        case 2 => STime(h, m +shift, s)
        case 3 => STime(h, m, s + shift)
      }

    }

  }


  object STime{
    def apply(h: Int, m: Int, s: Int)= new STime(h, m, s)
    def hours = 1
    def minutes = 2
    def seconds = 3



  }

  def main(args: Array[String]): Unit = {

  val t1 = STime(1,30,30)
    val t2 = STime(1,30,31)
    println(t1)
    println(t2)
    println(t1>t2 )
    println(t1<t2)
    println(t1==t2)
    println(t1!=t2)
    val t3 = t1.moveBy(10)(STime.seconds)
    println(t3)
  }
}
