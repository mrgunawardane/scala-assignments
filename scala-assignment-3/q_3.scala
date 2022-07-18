object Main extends App{
  
  val pi:Double = 3.14;
  printf("Enter the radius : ");
  var r:Double = scala.io.StdIn.readDouble();
  printf("Enter the height : ");
  var h:Double = scala.io.StdIn.readDouble();

  println("Volume is " + pi*r*r*r*3*4/3);

}
