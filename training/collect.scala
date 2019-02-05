object collect {
  def main(args: Array[String]): Unit = {



    val people = List( ("John", "Doe", 23, "male"), ("Joan", "Doe", 23, "female"),("Steve", "Jenkins", 24, "male"), ("Eva", "Robinson", 25, "female"), ("Ben", "Who", 22, "male"), ("Janet","Reed", 21, "female"), ("Rob", "Jenkins", 26, "male"), ("Ella", "Dawson", 27, "female") )

    println(people.partition(_._4=="female")._1)
    println(people.partition(_._4=="female")._2)

    println(people.partition(_._3>23)._1.map(_._1))

    println(people.exists(_._1=="John" ) || people.exists(_._1=="Joe" ))

    println(!people.exists(_._3 < 20))

    println(people.map(_._1)) //??
    println(people.map(_._3)) //??


    println(people.sortBy(_._3))

    println(people.partition(_._3 < 23))

    println(people.minBy(_._3))
    println(people.maxBy(_._3))

    println(people.partition(_._4=="female")._1.length.equals(people.partition(_._4=="female")._2.length))

    println(people.sortBy(_._3).dropWhile(_._3 < 24))
  }

}
