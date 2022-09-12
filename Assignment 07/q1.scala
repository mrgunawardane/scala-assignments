object Main extends App{
  
  def neg(input:String) : String = {
    // input become a const

    var res : String = input
    if(res.head == '-')
      res = res.substring(1)
    else  
      res = '-' + res

    return res
  }

  var input = scala.io.StdIn.readLine("Entter the rational number : ")
  println(neg(input))
}
