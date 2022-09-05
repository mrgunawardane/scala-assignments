object Main extends App{
  
  def getText():String = {
    var res: String = scala.io.StdIn.readLine("Enter the text - ")
    return res
  }

  def key():Int = {
    print("Enter key : ")
    var k:Int = scala.io.StdIn.readInt();
    return k;
  }

  def buildCipher(text: String, k:Int):Array[String] = {
    
    val n = 5;
    var m = 0;
    if(text.length()%5 == 0)
      m = text.length()/5
    else
      m = text.length()/5 + 1
    

    var cipherTable:Array[String] = new Array[String](m)
    var temp:String = ""
    var i = 0

    for(t <- text){
      
      temp = temp + (t.toInt + k%26).toChar

      if(temp.length() == 5){
        cipherTable(i) = temp
        i = i+1
        temp = ""
      }  
    }
    if(temp.length() != 0){
      while(temp.length() < 5){
        temp = temp + '`'
      }
      cipherTable(i) = temp
    }
    
    return cipherTable
  }

  def getCipherText(table:Array[String]):String = {
    //for(t <- table) println(t)
    var res = "";

    var size:Int = table.length - 1 
    for(i <- 0 to 4){
      for(j <- 0 to size){
        res = res+table(j)(i)
      }
    }
  
    return res
  }
  
  def decrypt(eText:String, key:Int):String = {
    
    var res : String = ""
    var m = eText.length/5
    
    var decryptTable = Array.ofDim[Char](m, 5)

    var n = 0

    for(i <- 0 to 4){
      for(j <- 0 to m-1){
        
        decryptTable(j)(i) = (eText(n).toInt - key%26).toChar
        n = n+1
      }
    }

    for(i <- 0 to m-1){
      for(j <- 0 to 4){
        if(i != m-1 || decryptTable(i)(j) != ']')
          res = res + decryptTable(i)(j)
      }
    }

    return res
  }

  //var table:Array[String] = buildCipher(scala.io.StdIn.readLine("Enter text - "), 3)
  //var encryptedText = getCipherText(table)

  //println(encryptedText)
  //var res: String = decrypt(encryptedText, 3)
  //println(res)


  def encryptData():String = {
    var table:Array[String] = buildCipher(scala.io.StdIn.readLine("Enter text - "), 3)
    var encryptedText = getCipherText(table)
    
    println("Encrypted data")
    println(encryptedText)
    return encryptedText
  }
  def decryptData():String = {
    var res: String = decrypt(scala.io.StdIn.readLine("Enter text - "), 3)
    println("Decrypted data")
    println(res)
    return res
  }

  def test() = {
    var text:String = encryptData()
    println("Decrypted data")
    println(decrypt(text, 3))
  }

  println("Please choose any option below")
  println("           1. Test");
  println("           2. Encrypt text");
  println("           3. Decrypt text");

  print("Enter option : ");
  var n = scala.io.StdIn.readInt();

  n match {
    case 1 => test()
    case 2 => encryptData()
    case 3 => decryptData()
    case _ => println("Please choose valid option")
  }
}



















