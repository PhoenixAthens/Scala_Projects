object Min_Time_To_Color_The_Rope {
  def minCost(color:String,neededTime:Array[Int]):Int={
    var time:Int=0
    for( i<-0 until color.length-1){
      if(color.charAt(i)==color.charAt(i+1)){
        if(neededTime(i)<neededTime(i+1)){
          time+=neededTime(i)
        }else if(neededTime(i+1)<neededTime(i)){
          time+=neededTime(i+1)
          val temp=neededTime(i)
          neededTime(i)=neededTime(i+1)
          neededTime(i+1)=temp
        }else{
          time+=neededTime(i)
        }
      }
    }
    time
  }
  def main(args:Array[String]):Unit={
    println(minCost("abaac",Array(1,2,3,4,5)))
  }

}
