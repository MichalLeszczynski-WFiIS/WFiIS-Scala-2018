object TraitMoves {


  class Point(var x: Int, var y: Int) {
    def print():Unit = println(x + " " + y)
  }

  trait Moves extends Point{

    def left = {x-=1
    this}
    def right = {x+=1
      this}
    def down = {y-=1
      this}
    def up = {y+=1
      this}

//    def right(): Point = x+=1 ; this
//    def up(): Point = y+=1 ; this
//    def down(): Point  = y -=1 ; this
  }

trait LimitX{
  var x: Int
  val min: Int = -2
  val max: Int = 2
if(x<min || x > max) println("ERROR")
}


  def main(args: Array[String]): Unit = {

  val p = new Point(0,0) with LimitX with Moves
  p.print()
    p.left.left.up.up.left
    p.print()



  }
}
