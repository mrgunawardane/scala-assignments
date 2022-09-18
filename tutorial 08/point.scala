import scala.collection.mutable.Map

object Main extends App{

  case class Point(point: Map[Char, Int]){

    require(point.contains('x') && point.contains('y'), "Please enter valid point")

    def +(that: Point):Point = Point(Map('x' -> (this.point('x') + that.point('x')), 'y' -> (this.point('y') + that.point('y'))))

    def move(a:Int, b:Int):Point = {
      this.point('x') = this.point('x') + a
      this.point('y') = this.point('y') + b

      this
    }
    def distance(that:Point):Double = Math.sqrt((Math.pow(this.point('x') - that.point('x'), 2) + Math.pow(this.point('y') - that.point('y'), 2)))

    def invert():Point = {
      var temp:Int = this.point('x')
      this.point('x') = this.point('y')
      this.point('y') = temp
      this
    }
  }

  var p1:Point = Point(Map('x'->2, 'y'->3))
  var p2:Point = Point(Map('x'->3, 'y'->2))

  var p:Point = p1 + p2
  println("Add p1 and p2 \n" + p)

  p.move(2,2)
  println("Move point by 2 : " + p)

  println("Distance between p1 and p2 : " + p1.distance(p2))

  println("Before invert p1 : " + p1)
  p1.invert()
  println("After invert p1 : " + p1)
}
