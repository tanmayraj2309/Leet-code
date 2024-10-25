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
    ArrayList<Integer> res=new ArrayList<>();
    public int countNodes(TreeNode root) {
        if(root!=null){
            res.add(root.val);
            countNodes(root.left);
            countNodes(root.right);
        }
        return res.size();
    }
}