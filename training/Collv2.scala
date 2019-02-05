object Collv2 {


def repeated(list: List[Int]): List[Int]= {
  val res = list.groupBy(el => el ).filter(_._2.length > 1).toList.map(_._1)
  res
}


def condMerge(ints: List[Int], ints1: Vector[Int], condition: PartialFunction[(Int,Int),Int]):  List[Int] = {
val zipped = ints.zip(ints1).collect(condition)
zipped
}

  def main(args: Array[String]): Unit = {



//println(repeated(List(-8,5,6,1,4,4,2,5,-1,9,9)))
//List(5,9,4)
//
 import math.max
  val m = condMerge(List(2, -9, 1, 8), Vector(3, -2, 45, 2),
    { case x: Tuple2[Int, Int] if max(x._1, x._2) > 0 => max(x._1, x._2) })
  println(m)
  //List(3,45,8)


}
}
