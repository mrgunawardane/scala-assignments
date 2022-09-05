object Main extends App{
  
  var text:String = scala.io.StdIn.readLine("Enter the text - ");
  var flag:Int = scala.io.StdIn.readLine("Select encrypt (1) or decrypt (2) : ").toInt;

  var key:Int = (scala.io.StdIn.readLine("Enter key - ").toInt);
  
  def encrypt(text:String, key:Int):String ={
    var res:String = "";
    for(t <- text){
      res = res + (t.toInt + key%26).toChar;
    }
    return res;
  }
  def decrypt(text:String, key:Int):String ={
    var res:String = "";
    for(t <- text){
      res = res + (t.toInt - key%26).toChar;
    }
    return res;
  }

  flag match{
    
    case 1 => println(encrypt(text, key));
    case 2 => println(decrypt(text, key));
    case _ => println("Please choose valid option ");
  }
}
