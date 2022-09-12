object Main extends App{
  
  class Account{
    
    private var amount:Double = 0

    def setAmount(n:Double):Unit = this.amount = if(n > 0) n else this.amount
    def getAmount():Double = this.amount

    def deposit(n:Double):Unit = this.amount = this.amount + n
    def transfer(acc:Account, amount:Double) = {
      if(this.amount >= amount){
        acc.deposit(amount)
        this.amount = this.amount - amount
      }
    }

  }

  var acc1 = new Account()
  var acc2 = new Account()

  acc1.setAmount(1000)
  acc2.setAmount(5000)

  acc2.transfer(acc1, 1000)

  println("Balance of account 1 : " + acc1.getAmount())
  println("Balance of account 2 : " + acc2.getAmount())

}

