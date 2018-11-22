object task1lab3 {


  def concat(str: String *): String = concat(str.toArray)
  def concat(str: Array[String]): String = if(str.tail.isEmpty) " " else str.head + concat(str.tail)
  def <(str: String): Unit = println(str)
  def <<() : Unit = println("I am here")
  //def maximum(a: Int = Int.MinValue)(b: Int = Int.MinValue)(c: Int = Int.MinValue): Int = Array(a, b, c).max


    def maximum(i: Int = Int.MinValue)(j: Int = Int.MinValue): Int => Int = {
      k: Int => {
        if (i > j) {
          if (i > k)
            i
          else
            k
        } else {
          if (j > k)
            j
          else
            k
        }
      }
    }

  def main(args: Array[String]): Unit = {



    println( concat("hello") )
    println( concat("hello"," all") )
    println( concat("hello"," all"," the") )
    println( concat("hello"," all", " the", " word", " and", " all", " people") )
    <("here we are again")
    <<
    // prints empty line
     println( maximum(3)(5)(1))
     println( maximum(3)(5)(8) )
      println( maximum(9)(5)(8) )

     val rangeMax = maximum()(100)

     println( rangeMax(200) )
      println( rangeMax(2))



  }
}
