object CheckIfTwoStringsAreEqual{
  def arrayStringsAreEqual(word1: Array[String], word2: Array[String]): Boolean = {
    var w1: String = ""
    var w2:String=""
    for( i <- word1){
      w1+=i
    }
    for( i <- word2){
      w2+=i
    }
    w1.equals(w2)
  }
  def main(args:Array[String]):Unit={
    println(arrayStringsAreEqual(Array("a","b","c"),Array("a","c","b")))
  }
}
