//object Typesv2 {
//
//
//  trait Plant{
//    def name = "noname"
//  }
//
//  trait Animal{
//    def name
//    type Food
//    abstract def eat(f: Food)
//  }
//
//
//  class Cow(name: String) extends Animal{
//    def eat(f: Plant) = println(this.name + "eats" + f.name)
//  }
//  class Woolf(name: String) extends Animal{
//    override def eat(f: Cow) = println(this.name + "eats" + f.name)
//  }
//
//
//  class Grass(name: String = "Grass") extends Plant
//  class Hay(name: String = "Hay") extends Plant
//
//
//
//
//
//  def main(args: Array[String]): Unit = {
//
//    val g = new Grass
//    val h = new Hay
//    val c1 = new Cow("ANiceCow")
//    val c2 = new Cow("MilkyCow")
//    val w1 = new Woolf("CowEaterBeast")
//
//    w1.eat(g)
//
//    c1.eat(g)
//    c2.eat(h)
//
//    c1.eat(c1)
//
//    w1.eat(c1)
//
//
//
//
//  }
//}
