object Main extends App{
  
  val tax : Float = 0.12f;
  var salaryForNormalHour: Int = 250;
  var salaryForOtHour : Int = 85;

  def salary(normal : Int , ot : Int): Float = {
    var sal: Float = normal*salaryForNormalHour + ot*salaryForOtHour;
    var taxAmount = sal*tax;
    sal = sal-taxAmount;
    return sal;
  }

  println("A typical employee get " + salary(40, 30) *4 + " for a month.");
  
  println("Enter your normal work hours for this month : ");
  var normalHour: Int = scala.io.StdIn.readInt();
  println("Enter your OT work hours for this month : ");
  var otHour: Int = scala.io.StdIn.readInt();

  println("You get " + salary(normalHour, otHour)  + " for this month.");
}
