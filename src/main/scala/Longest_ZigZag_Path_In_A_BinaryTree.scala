class Longest_ZigZag_Path_In_A_BinaryTree {
  //Runtime: 773ms beats 62.22%, Memory: 119MB beats 6.67%
  class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
    var value: Int = _value
    var left: TreeNode = _left
    var right: TreeNode = _right

  }
  object Solution {

    def longestZigZag(root: TreeNode): Int = {
      val arrMax = Array(1)
      dfs(root,1,0,arrMax);
      dfs(root,0,0,arrMax);
      arrMax(0);
    }
    private def dfs(root:TreeNode, goLeft:Int, count:Int, maximum:Array[Int]):Unit={
      if(root==null)return
      maximum(0)=math.max(maximum(0),count)
      if(goLeft==1){
        dfs(root.left,0,count+1,maximum)
        dfs(root.right,1,1,maximum)
      }else{
        dfs(root.right,1,count+1,maximum)
        dfs(root.left,0,1,maximum)
      }
    }
  }

}
