object Main extends App{
  
  //var name:String = scala.io.StdIn.readLine("Enter your name : ");

  def formatNames(name:String, indexes:List[Int], func :(String) => String):String = {
    if(indexes.isEmpty){
      return func(name);
    }else{
      var res:String = "";
      var i:Int = 0;

      while(i < name.length()){
        var temp:String = name(i).toString;
        if(indexes.contains(i)){
          temp = func(temp);
          i += 1;
          res += temp;
        }else{
          i += 1;
          res += temp;
        }
      }
      return res;
    }
  }

  var name1:String = "Benny";
  var name2:String = "Niroshan";
  var name3:String = "Saman";
  var name4:String = "Kumara";

  println(formatNames(name1,List(),name1 => name1.toUpperCase()));
  println(formatNames(name2,List(0,1),name2 => name2.toUpperCase()));
  println(formatNames(name3,List(),name3 => name3.toLowerCase()));
  println(formatNames(name4,List(0,5),name4 => name4.toUpperCase()));
}
