import scala.annotation.tailrec

object ClosestNodeToTwoGivenNodes_DFS {
  //Runtime: 1064ms beats 100%, Memory: 80.8MB beats 100%
  def closestMeetingNode(edges: Array[Int], node1: Int, node2: Int): Int = {
    val n = edges.length
    val dist1 = Array.fill[Int](n)(-27)
    val dist2 = Array.fill[Int](n)(-27)
    val visit1 = Array.fill[Boolean](n)(false)
    val visit2 = Array.fill[Boolean](n)(false)
    dist1(node1) = 0
    dist2(node2) = 0
    dfs(edges,dist1,visit1,node1)
    dfs(edges,dist2,visit2,node2)
    var currResult = -1
    var maxDist = 2_000_000_000
    for(i <- 0 until n){
      if(dist1(i)!=(-27) && dist2(i)!=(-27) ){
        val tempDist = Math.max(dist1(i),dist2(i))
        if(tempDist<maxDist){
          maxDist = tempDist
          currResult = i
        }
      }
    }
    currResult
  }
  @tailrec
  private def dfs(edges:Array[Int], dist:Array[Int], visit:Array[Boolean], node:Int): Unit = {
    if(!visit(node) ){
      visit(node) = true
      val neighbor = edges(node)
      if(neighbor!=(-1) && !visit(neighbor)){
        dist(neighbor)=1+dist(node)
        dfs(edges,dist,visit,neighbor)
      }
    }
  }
}
