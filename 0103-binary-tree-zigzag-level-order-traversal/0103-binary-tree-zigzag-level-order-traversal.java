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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
         
        
       List<List<Integer>> ans=new ArrayList<>();
       if (root == null) {
            return ans; 
        }

    Queue<TreeNode> q= new LinkedList<>();
    q.add(root);
    boolean reverse=false;
    while(!q.isEmpty()){
        int n=q.size();
        List<Integer> temp=new ArrayList<>();
        for(int i=0;i<n;i++){
            TreeNode q1= q.poll();
            temp.add(q1.val);
            if(q1.left!=null){
                q.add(q1.left);
            }
            if(q1.right!=null){
                q.add(q1.right);
            }
        }
        if(reverse){
            Collections.reverse(temp);
        }
        ans.add(temp);
        reverse=!reverse;
    }
    return ans;
        
    }
}