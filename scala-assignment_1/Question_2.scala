object Main extends App{
  var a = 2;
  var b = 3;
  var c = 4;
  var d = 5;
  var k : Float = 4.3f;
  var g : Float = 4.0f
// we can not do assignments in println, like a+=1, because this doesn't return any thing(type is unit)
  
  b -= 1;
  println(b*a+c*d);
  d -= 1;

  a += 1;
  println(a);

  println(-2*(g-k)+c);

  println("c = c++ = " + c);
  c += 1;

  c += 1;
  c = c*a;
  println(c);
  a += 1;
  
}
