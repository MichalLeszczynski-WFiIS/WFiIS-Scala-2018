object merge {

 /* def mmmerge(left: List[Int], right: List[Int], result: List[Int]): List[Int] =
    (left, right) match {
      case (_, Nil) => left
      case (Nil, _) => right
      case (leftHead :: leftTail, rightHead :: rightTail) =>
        if (leftHead < rightHead) leftHead :: mmerge(leftTail, right)
        else rightHead :: mmerge(left, rightTail)
    }




  def mmerge(left: List[Int], right: List[Int]): List[Int] =
    (left, right) match {
      case (_, Nil) => left
      case (Nil, _) => right
      case (leftHead :: leftTail, rightHead :: rightTail) =>
        if (leftHead < rightHead) leftHead :: mmerge(leftTail, right)
        else rightHead :: mmerge(left, rightTail)
    }

  def main(args: Array[String]): Unit = {

    val testList1 = List(9,5,2,1,-5)
    val testList2 = List(15,9,5,-1,-90)
    val mergedTestList = mmmerge( testList1,testList2)
    println( mergedTestList.mkString( " "))


  }*/
}
