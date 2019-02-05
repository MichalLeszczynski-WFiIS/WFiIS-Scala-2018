object Finances {

  class Bookkeeping(var balance: Int = 0, var exp: List[Expense] = List.empty, var inc: List[Income] = List.empty) {

    def +=(income: Income): Unit = {
      inc = income :: inc; balance += income.amount
    }

    def -=(expense: Expense): Unit = {
      exp = expense :: exp; balance -= expense.amount
    }

    def PrintAll(): Unit = {
      for (e <- exp) println(e)
      for (i <- inc) println(i)
      println("Balance: " + balance)
    }
  }

  object Bookkeeping {
    def apply() = new Bookkeeping()
  }

  class Expense(val amount: Int, val description: String) {
    override def toString: String = "-" + amount.toString + " --- \"" + description + "\""

    def +(second: Expense) = Expense(amount + second.amount, description + second.description)
  }

  object Expense {
    def apply(amount: Int, description: String) = new Expense(amount, description)
  }


  class Income(val amount: Int, val description: String, val date: String) {

    override def toString: String = "+" + amount.toString + " --- \"" + description + "\" " + date


  }

  object Income {
    def apply(amount: Int, description: String, date: String) = new Income(amount, description, date)
  }


  def main(args: Array[String]): Unit = {

    val bk = new Bookkeeping()
    bk -= Expense(20, "lunch")
    bk -= Expense(200, "jacket")
    bk += Income(1000, "subsistence", "10 December")
    bk.PrintAll()
  }

}
