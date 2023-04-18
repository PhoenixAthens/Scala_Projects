//Date: 18th April, 2023
object MergeStringsAlternately {
  //Runtime: 459ms beats 100%, Memory: 52.6MB beats 66.67%
  def mergeAlternately(word1: String, word2: String): String = {
    var mergedString = new StringBuilder
    val len1=word1.length
    val len2=word2.length
    if(len1>len2){
      (0 until len2)
        .foreach(i => {
          mergedString ++= word1.charAt(i).toString
          mergedString ++= word2.charAt(i).toString
        })
      (len2 until len1)
        .foreach(i => mergedString ++= word1.charAt(i).toString)
    }else if(len2>len1){
      (0 until len1)
        .foreach(i => {
          mergedString ++= word1.charAt(i).toString
          mergedString ++= word2.charAt(i).toString
        })
      (len1 until len2)
        .foreach(i => mergedString ++= word2.charAt(i).toString)
    }else{
      (0 until len1)
        .foreach(i => {
          mergedString ++= word1.charAt(i).toString
          mergedString ++= word2.charAt(i).toString
        })
    }
    mergedString.toString
  }
}
