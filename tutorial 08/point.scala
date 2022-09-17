object Main extends App{

  case class Point(a:Int, b:Int){

    private var x:Int = a
    private var y:Int = b

    def add(p:Point):Point = Point(p.x + this.x, p.y + this.y)

    def move(n:Int, m:Int):Point = {
      // because case class immutable
      var p:Point = Point(x+n, y+m)
      return p
    }
    def distance(p:Point):Double = {
      Math.sqrt(Math.pow((this.x - p.x), 2) + Math.pow((this.y - p.y),2))
    }

    def invert():Point = Point(y, x)
  }

  var p1 = Point(2, 3)
  var p2 = Point(3, 4)

  var p:Point = p1.add(p2)
  println("Atfer adding p1 and p2 : " + p)

  println("Before Move : " + p1)
  p1 = p1.move(2 , 2)
  println("After move : " + p1)

  println("Distance between p1 and p2 : " + p1.distance(p2))

  println("Before invert : " + p1)
  p1 = p1.invert()
  println("After invert : " + p1)
}