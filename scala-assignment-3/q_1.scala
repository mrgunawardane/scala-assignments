object Main extends App{
  
  val pi: Float = 3.14f;
  printf("Enter the radius of disk : ");
  var r = scala.io.StdIn.readFloat();

  println("Area of the disk is " + pi*r*r);
}
