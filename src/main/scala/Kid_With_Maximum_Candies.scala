//Runtime: 531ms beats 83.33%, Memory: 53.2MB beats 100%
object Kid_With_Maximum_Candies {
  def kidsWithCandies(candies: Array[Int], extraCandies: Int): List[Boolean] = {
    val result:Array[Boolean] = Array.ofDim[Boolean](candies.length)
    var maxValue = 0
    for( candy <- candies){
      maxValue=math.max(maxValue,candy);
    }
    var index=0
    for( candy <- candies){
      if(candy+extraCandies >= maxValue) result.update(index,true)
      index+=1
    }
    result.toList
  }
  // Runtime: 524ms beats 100%, Memory: 53.4MB beats 83.33%
  def alternate(candies: Array[Int], extraCandies: Int): List[Boolean] = {
    val maxValue = candies.max
    candies.map(cand => cand+extraCandies>=maxValue).toList
  }

}
