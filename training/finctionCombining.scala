package scala.math

object finctionCombining {
  def pi(argument: Double = 1.0 ): Double =  Pi * argument
  def pi() : Double = Pi
  def main(args: Array[String]): Unit = {

    def max(a: Int)(b: Int):Int = if(a>b) a else b
    def printarg(arg: String = "-"): Unit = println(arg)
    def repN(iterations: Int, function: Int=> Int, startValue: Int):Int ={if(iterations<1) 1 else function(repN(iterations-1, function, startValue) )    }
    def pall(args: Int*):Unit ={println("Hello"); for(a<-args) print(a + " ")}
    println( pi )
    println( pi(pi ))
    println( pi(pi(pi) ))
    printarg(arg="hello")
    printarg()
    println(repN(5,  (x: Int) => 2*x , 1 ))
    // invokes the function N times (here 5) passing the previous result to it, implementation doesnot need to be recursive of course
    println( max(4)(5) )
    pall( 1,2,3,4,5,4, 3, 3, 4)


  }
}
