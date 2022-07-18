object Main extends App{
  
  def convert_to_F(c:Double) : Double = {
    var f:Double = c*1.8 + 32;
    return f;
  }
  printf("Enter temperature in celcius : ");
  var c_val = scala.io.StdIn.readDouble();

  println("Temperature in Fahrenheit : " + convert_to_F(c_val));
}
