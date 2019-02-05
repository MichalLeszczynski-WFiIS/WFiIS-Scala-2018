object FinancesPoli {

  class Bookkeeping(var balance: Int = 0, var listOfTransfers: List[MoneyFlow] = List.empty) {

    def +=(transfer: MoneyFlow): Unit = {
      listOfTransfers = transfer :: listOfTransfers; balance += transfer.realAmount
    }

    def PrintAll(): Unit = {
      println("Balance: " + balance)
      for (t <- listOfTransfers) println(t)
    }
  }

  object Bookkeeping {
    def apply() = new Bookkeeping()
  }
  abstract class MoneyFlow(val amount: Int, val description: String){

  def realAmount: Int

  }


  class Expense(amount: Int,description: String) extends MoneyFlow(amount,description) {
    override def toString: String = "-" + amount.toString + " --- \"" + description + "\""

    def +(second: Expense) = Expense(amount + second.amount, description + second.description)
    val realAmount: Int = -amount
  }

  object Expense {
    def apply(amount: Int, description: String) = new Expense(amount, description)
  }


  class Income(amount: Int,description: String, val date: String) extends MoneyFlow(amount, description) {

    override def toString: String = "+" + amount.toString + " --- \"" + description + "\" " + date
    val realAmount: Int = amount
  }

  object Income {
    def apply(amount: Int, description: String, date: String) = new Income(amount, description, date)
  }


  def main(args: Array[String]): Unit = {

    val bk = new Bookkeeping()
    bk += Expense(20, "lunch")
    bk += Expense(200, "jacket")
    bk += Income(1000, "subsistence", "10 December")
    bk.PrintAll()
  }

}



