object Main extends App{
  
  val speed_time1 : Int = 8;
  val speed_time2 : Int = 7;

  var dis1 : Int = 2;
  var dis2 : Int = 3;
  var dis3 : Int = 2;

  var total_time = dis1*speed_time1 + dis2*speed_time2 + dis3*speed_time1;
  println("Total time is " + total_time);

  // we can not do above calculation in println, because there is + sign so it get as a concat
}
