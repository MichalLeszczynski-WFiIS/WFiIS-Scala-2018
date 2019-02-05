object task1lab8 {


abstract class Ingridient{
  def name: String
  def price: Double

}


  class ThinDough extends Ingridient{

    override def price: Double = 7
    override def name: String = "on thin dough "

  }


  trait TomatoSauce extends Ingridient{
    abstract override def name =   " Tomato Sauce" + super.name
    abstract override def price = 3 + super.price
  }
 trait Mozarella extends Ingridient{
   abstract override def name =" Mozarella" + super.name
   abstract override def price =1 + super.price
  }

  trait Ham extends Ingridient{
    abstract override def name = " Ham " + super.name
    abstract override def price =30 + super.price
  }

  trait Mushroms extends Ingridient{
    abstract override def name = " Mushroms" + super.name
    abstract override def price =  15.5 + super.price
  }

  def main(args: Array[String]): Unit = {


    val myPizza = new ThinDough with Ham with TomatoSauce
    println( myPizza.name + myPizza.price )



  }
}
