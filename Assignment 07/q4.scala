object Main extends App{
  
  class Account(n:Double = 0){

    private var amount:Double = n

    def setAmount(n:Double):Unit = this.amount = if(n > 0) n else this.amount
    def getAmount():Double = this.amount

    def deposit(n:Double):Unit = this.amount = this.amount + n
    def transfer(acc:Account, amount:Double) = {
      if(this.amount >= amount){
        acc.deposit(amount)
        this.amount = this.amount - amount
      }
    }
    def addInterest(n:Double):Unit = amount = amount + amount*n

  }

  def getNegative(arr:Array[Account]):Array[Account] = for{acc <- arr; if(acc.getAmount < 0)} yield acc
  
  def sumOfAll(arr:Array[Account]):Double = {
    var res:Double = 0
    for(acc <- arr) res = res + acc.getAmount()
    return res
  }

  def addInterestForAll(arr:Array[Account]):Unit ={

    for(acc <- arr){
      var n:Double = if(acc.getAmount() > 0) 0.05 else -0.1
      acc.addInterest(n)
    }
  }

  var accList:Array[Account] = Array(new Account(2000), new Account(3000), new Account(-5000), new Account(1000), new Account(-8000))

  var negAccounts = getNegative(accList)
  for(acc <- negAccounts) println(acc.getAmount())

  println("Sum of all accounts : " + sumOfAll(accList))

  addInterestForAll(accList)
  println("Sum of all accounts after adding interest : " + sumOfAll(accList))

}
