object Main extends App{

  def remove(a: Array[String], i: Int): Array[String] = {
    var temp = a.toBuffer
    temp.remove(i)
    return temp.toArray
  }

  
  def f(arr:Array[String]):String = {
    
    if(arr.length < 2)
      return arr(0)
    var input1 = arr.head.split("/")
    var input2 = arr.tail.head.split("/")
   
    var h1:Int = input1(1).toInt
    var l1:Int = input1(0).toInt

    var h2:Int = input2(1).toInt
    var l2:Int = input2(0).toInt

    if(h1 == h2)
      l1 = l1-l2
    else{
      l1 = l1*h2 - h1*l2
      h1 = h1*h2
    }

    var temp:Array[String] = arr
    var res : String = l1.toString + "/" + h1.toString

    temp = remove(temp, 0)
    temp(0) = res

    f(temp)
  }

  def gcd(n1:Int, n2:Int):Int = {
    if(n2 != 0)
      return gcd(n2, n1%n2)
    else return n1
  }

  def simplified(res: String): String = {
    var temp = res.split("/")
    return (temp(0).toInt / gcd(temp(0).toInt, temp(1).toInt)).toString + "/" + (temp(1).toInt / gcd(temp(0).toInt, temp(1).toInt)).toString
  }

  var arr:Array[String] = new Array[String](3)
  arr(0) = scala.io.StdIn.readLine("Enter x : ")
  arr(1) = scala.io.StdIn.readLine("Enter y : ")
  arr(2) = scala.io.StdIn.readLine("Enter z : ")

  println("Result is " + simplified(f(arr)))
}
