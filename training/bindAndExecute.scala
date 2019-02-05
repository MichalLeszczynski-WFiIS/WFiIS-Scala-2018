object bindAndExecute {






  def main(args: Array[String]): Unit = {

  var z = 1.0
    def lam(a: Int, b: Int):Int =(( a * b )/z).toInt
    def bindAndExecute(unit: =>Unit)(fun: (Int, Int) => Int)(list: List[(Int,Int)]): List[Int] ={
      unit
        def dupa(list: List[(Int, Int)])(result: List[Int] = List.empty): List[Int] = {

          if(list.isEmpty)
            result
          else
          dupa(list.tail)(fun(list.head._1, list.head._2) ::  result)
        }
      dupa(list)()
    }


    val result1 = bindAndExecute{z = 0.3;}{ lam}{List( (4, 6), (4, 3), (8, 1))}
    println(result1)
    val result2 = bindAndExecute{z = -2.5}{ lam}{ List( (4, 6), (4, 3), (8,1) )}
    println(result2)
  }
}
