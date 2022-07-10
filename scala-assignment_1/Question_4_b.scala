object Main extends App{

  val performanceCost : Int = 500;
  def genarateProfit(price: Int, count: Int) : Int = {
    var profit = price*count - performanceCost;
    return profit;
  }

  println("When price is 15, profit is "+ genarateProfit(15, 120));
  println("When price is 10, profit is "+ genarateProfit(10, 140));
  println("When price is 20, profit is "+ genarateProfit(20, 100));
} 
