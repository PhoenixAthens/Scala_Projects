class ClosestNodeToTwoGivenNodes {
  //Runtime: 1024ms beats 100%, Memory: 78MB beats 100%
  object Solution {
    def closestMeetingNode(edges: Array[Int], node1: Int, node2: Int): Int = {
      var dist1=Array.fill[Int](edges.length)(-27)
      var dist2=Array.fill[Int](edges.length)(-27)
      binaryFirstSearch(dist1,edges,node1)
      binaryFirstSearch(dist2,edges,node2)
      var tempTillNow = 2_000_000_000
      var resultNode = -1
      for(i <- 0 until edges.length){
        if(dist1(i)!=(-27) &&  dist2(i)!=(-27)){
          val maxTemp=math.max(dist1(i),dist2(i))
          if(maxTemp < tempTillNow){
            resultNode = i
            tempTillNow = maxTemp
          }
        }
      }
      resultNode

    }
    def binaryFirstSearch(dist:Array[Int],edges:Array[Int],node:Int): Unit = {
      var boolArray:Array[Boolean]=Array.ofDim[Boolean](edges.length)
      dist(node)=0
      var presentNode = node
      while(presentNode!=(-1234)){
        if(!boolArray(presentNode)){
          boolArray(presentNode)=true
          val neighbor:Int = edges(presentNode)
          if(neighbor!=(-1) && !boolArray(neighbor)){
            dist(neighbor)=dist(presentNode)+1
            presentNode=neighbor
          }else{
            presentNode=(-1234)
          }
        }
      }
    }
  }

}
