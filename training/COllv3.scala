
object COllv3 {



  def indicate(list: List[List[Int]], condition: Int => Boolean): List[Boolean]  = {

  val res  = list.map(_.forall(_>=0 )).filter(_==true)
  res
  }

//  def Int(List[Int]): Int = {
//
//  }

//  def synchForEach(list: List[List[Int]], function: Nothing => Any) ={
//
//  }

  def main(args: Array[String]): Unit = {

    val in = List(
      List(1,2,3,4),
      List(5,0,-1,7),
      List(-1,51,1,0),
      List(0,0,7,7))

    val biggest = in.maxBy(_.max).max
      println(biggest)

    val biggcoll =  in.maxBy(_.max)
    println(biggcoll)

    val listOfBiggest = in.map(_.max)
      println(listOfBiggest)

   println(indicate(in, {case x if x < 0 => true}))

//    println(synchForEach(in, {x => x}))
//
//    println(synchForEach(in, {x => x.max}))


  }
}
