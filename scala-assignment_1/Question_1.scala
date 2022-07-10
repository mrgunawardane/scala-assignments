object Main extends App{
  
  var k,i,j : Int = 2;
  var m,n : Int = 5;
  var f : Float = 12.0f;
  var g : Float = 4.0f;
  var c : Char = 'X';

  var res1 = k+12*m;
  println("k + 12 * m = " + res1);

  var res2 = m./(j);
  println("m/j = " + res2);

  var res3 = n%j;
  println("n%j = " + res3);

  var res4 = m/j*j;
  println("m/j*j = "+ res4);

  var res5 = f+10*5 + g;
  println("f+10*5+g = " + res5);

  i+=1;
  var res6 = i*n;
  println("i += 1\ni*n = "+ res6);
  println("Beause preincrement and post increment does not work in scala");
}
