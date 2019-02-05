object task2lab8 {


  def extr(list: List[Any]): List[Any] = {
    list.map(_ match {
      case map: Map[String, String] => {
        if(map contains "name") {
          new Person(map("name"), map("fname"), map("age").toInt)
        } else {
          new Company(map("company"), map("origin"))
        }
      }
      case rest: List[String] => new rest(rest(0),rest(1))
    }
    )
  }

  class Person(val name: String, val fname: String, val age: Int) {
    override def toString: String = "Person(" + name + "," + fname + "," + age + ")"
  }
  class Company(val name: String, val origin: String) {
    override def toString: String = "Company(" + name + ", " + origin + ")"
  }
  class rest(val w1: String, val w2: String) {
    override def toString: String = "DiWord(" + w1+ "," + w2 + ")"
  }


    def main(args: Array[String]): Unit = {
      val data = List( Map("name" -> "Jan", "fname" -> "Kowalski", "age" -> "45"),
        Map("company" -> "ABB", "origin" -> "Sweden"),
        Map("name" -> "Katarzyna", "fname" -> "Nowak", "age" -> "45"),
        Map("company" -> "F4", "origin" -> "Poland"),
        List("Cos", "innego"),
        Map("company" -> "Salina Bochnia", "origin" -> "Poland"),
        Map("company" -> "AGH", "origin" -> "Poland"),
        Map("name" -> "Krzysztof", "fname" -> "Krol", "age" -> "14")
      )
      val p = extr(data)
      println(p)
    //  println(onlyPeople(p))
    //  println(onlyComp(p))
    }








}
