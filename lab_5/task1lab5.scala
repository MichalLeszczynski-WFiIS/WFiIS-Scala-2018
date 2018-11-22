

object task1lab5 {


@annotation.tailrec  def redux1(input: List[Int])(operator: (Int, Int) =>Int)(result: Int = input.head): Int={
  if(input.tail.isEmpty)
    result
    else
    redux1(input.tail)(operator)(operator(result, input.tail.head))
  }

  def redux(input: List[Int])(operator: (Int, Int) =>Int): Int ={
    redux1(input)(operator)()
  }



  def main(args: Array[String]): Unit = {

    val a = redux(List(1,7,8,9,10))(_+_)
    val b = redux(List(2,-4,5,-2,4))(_* math.abs(_))

    println(a)
    println(b)
  }
}
