//object ExprMathing {
//
//
//  class diWord(val s1: String,val s2: String){
//    override def toString: String ="diWord(" +s1 + ", " + s2 +")"
//  }
//  class Person(val name: String,val fname: String,val age: String){
//    override def toString: String ="Person(" +name + ", " + fname + ", " + age+ ")"
//  }
//
//  class Company(val company: String,val origin: String){
//    override def toString: String ="Company(" +company + ", " + origin +")"
//  }
//
//
// @annotation.tailrec def extr(list: List[Any], result: List[Any] = List.empty[Any]): List[Any] ={
//    if(list.isEmpty)
//      result
//    else
//      list.head match{
//        case map: Map =>
//          map match{
//            case per  => extr(list.tail, new Person(per("name"), per("fname"), per("age"))::result)
//            case cmp => extr(list.tail, new Company(cmp("company"), cmp("origin"))::result)
//
//          }
//        case els: List[String] => extr(list.tail,new diWord(els.head, els.tail.head)::result)
//      }
//
//  }
//
//
//
//
//  def main(args: Array[String]): Unit = {
//
//
//    val data =
//      List(Map("name" -> "Jan", "fname" -> "Kowalski", "age" -> "45"),
//        Map("company" -> "ABB", "origin" -> "Sweden"),
//        Map("name" -> "Katarzyna", "fname" -> "Nowak", "age" -> "45"),
//        Map("company" -> "F4", "origin" -> "Poland"),
//        List("Cos", "innego"),
//        Map("company" -> "Salina Bochnia", "origin" -> "Poland"),
//        Map("company" -> "AGH", "origin" -> "Poland"),
//        Map("name" -> "Krzysztof", "fname" -> "Krol", "age" -> "14"))
//    val p = extr(data)
//    println(p)
//    // println(onlyPeople(p))
//    // println(onlyComp(p))
//
//
//  }
//}
