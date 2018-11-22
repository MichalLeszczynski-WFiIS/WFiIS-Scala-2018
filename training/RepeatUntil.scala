object RepeatUntil {


  def repeatUntil(instructions: => Int)(condition: Int => Boolean): Unit =
  {
    if(condition(instructions)) repeatUntil(instructions)(condition)
  }

  def main(args: Array[String]): Unit = {


var x = -5

    repeatUntil{ x = x+1; println(x); x }{ _ <= 0}
    repeatUntil{ x = x-3; println(x); x }{ _ > -10}
    repeatUntil{ x = x+7; println(x); x }{ i:Int => i<20}

  }
}
