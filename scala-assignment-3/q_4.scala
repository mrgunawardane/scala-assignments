object Main extends App{
  
  val discount : Double = 0.4;
  val price : Double = 24.95;

  var shipping_cost : Double = 3;
  var additional_cost : Double = 0.75;

  printf("Enter number of copies : ");
  var count = scala.io.StdIn.readDouble();

  var shipping = count*shipping_cost;
  
  if(count > 50){
    shipping += (count - 50)*additional_cost;
  }

  var bookstore = price * discount * count;
  var total_cost = bookstore + shipping;
  println("Total cost per " + count + " copies : " + total_cost);
}
