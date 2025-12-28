/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private boolean dfs(TreeNode node, int pathsum,int target){
        if(node == null) return false;
        pathsum=pathsum+node.val;
        if(node.left== null && node.right==null)  return pathsum==target;
        boolean left=dfs(node.left,pathsum,target);
        boolean right=dfs(node.right,pathsum,target);
        return left || right;

    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return dfs(root,0,targetSum);
    }
}