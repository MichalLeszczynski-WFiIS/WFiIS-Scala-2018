object lab2zad1 {

  def main(args: Array[String]):Unit = {
    if(args.length >1 ){ println("Za duzo argumentow"); return}


    val x = if(args.length == 0) 20 else args(0).toInt
    val range = 0 to x
    val lista = range.toList
    println(lista);

    fuzzyBuzzy(lista)
  }
  def fuzzyBuzzy(list: List[Int]): Unit =
  {
    for(value <- list){
      if(value %3 == 0 && value % 5 == 0){println("Fizz Buzz")}
      else if(value%3==0){println("Fizz")}
      else if(value%5==0){println("Buzz")}
      else{println(value)}
    }
  }
}
