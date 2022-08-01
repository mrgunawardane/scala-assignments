object Main extends App{
  
  printf("Enter the amount : "); // I use printf because I want to get input in one line
  var amount:Double = scala.io.StdIn.readDouble();

  def interest(amt:Double):Double = amt match{
    case amt if amt < 20000 => amt*0.02;
    case amt if amt < 200000 => amt*0.04;
    case amt if amt < 2000000 => amt*0.035;
    case amt if amt >= 2000000 => amt*0.065;
  }
  var interestPerYear:Double = interest(amount);
  println("Interest per year : " + interestPerYear);

  var totalAmount:Double = amount + interestPerYear;
  println("Total amount of this year : " + totalAmount);
  
}
