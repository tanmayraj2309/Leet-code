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
    public List<Double> averageOfLevels(TreeNode root) {
            Queue<TreeNode> q= new LinkedList<>();
            List<Double> ans= new ArrayList<>();
            q.add(root);
           
            while(!q.isEmpty()){
              int n= q.size();
               double count=0;
               double currsum=0.0;

              for(int i=0;i<n;i++){
                TreeNode temp=q.remove();
                currsum=currsum+temp.val;
                count++;
                if(temp.left!=null){
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                }
               
              }
               double avg=currsum/count;
                ans.add(avg);
            
            }
            return ans;
        
    }
}