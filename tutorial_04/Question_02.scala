object Main extends App{
  printf("Enter a number : ");
  var num:Int = scala.io.StdIn.readInt();

  def numberPattern(n:Int):String = n match{
    case n if n <= 0 => "Negative/Zero";
    case n if n%2 == 0 => "Even number";
    case n if n%2 == 1 => "Odd number";
  }

  println(numberPattern(num));
}
