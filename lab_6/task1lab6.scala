object task1lab6 {



 def forel(list: List[Int])(condition: Int => Boolean)(instructionsTrue: =>Unit)(instructionsFalse: =>Unit): Int = {
   @annotation.tailrec def forelSecond(list: List[Int])(count: Int = 0): Int = {
    if (list.isEmpty)
      count
    else {
      if (condition(list.head)) {instructionsTrue;
      forelSecond(list.tail)(count + 1)} else{ instructionsFalse
      forelSecond(list.tail)(count)}
    }
  }
  forelSecond(list)()
}


  def main(args: Array[String]): Unit = {



    val li = List(1,4,3,4,52,3,2)
    val npos1 = forel( li)(_<5) {println("<3")} {println(" not <3 ")}
    println(npos1)

    val npos2 = forel( li)( _%3 ==0) {println("divisible by 3")}{println( "not divisible by 3")}
    println(npos2)

  }
}
