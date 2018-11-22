object middle {


  def mid(a: (Int, Int) = (Int.MinValue, Int.MinValue)): Int => Int = {
    k: Int => {
      val arr = List(a._1, a._2, k)
     val result = arr.sorted
      result(1)
    }
  }

 @annotation.tailrec def @@(word: String = "")(count: Int = 1): Unit = {

    println(word)
    if(count>1)
      @@(word)(count-1)

  }
  //def compose2(prefix: String=>String,postfix: String=>String): String=>String  = postfix(prefix(_))
      def main(args: Array[String]): Unit = {

        println(mid((3, 5))(1))
        println(mid((3, 5))(8))
        println(mid((9, 5))(8))

        val fixedMid = mid( (0,100) )
        println( fixedMid(200))
        println( fixedMid(2))


        @@( "Hello" )()
        @@( "abc")(4)
        @@()(2)
        @@( "abc")()

        def add_<(arg: String) = "<"+arg
        def add_>(arg: String) = arg+"<"
      //  val wrap = compose2(add_<,add_>)
       // println(wrap("hello"))

      }

  }



