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
    public int minimumOperations(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int tS = 0;
        while(!q.isEmpty()){
            int s = q.size();
            int v[] = new int[s];
            for(int i=0;i<s;i++){
                TreeNode node = q.poll();
                v[i] = node.val;
                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
            }
            tS = tS+Swap(v);
        }
        return tS;
    }
    private int Swap(int o[]){
        int n = o.length;
        int swap = 0;
        int target[] = o.clone();
        Arrays.sort(target);
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(o[i],i);
        }
        for(int i=0;i<n;i++){
            if(o[i]!=target[i]){
                swap++;
                int cur = map.get(target[i]);
                map.put(o[i],cur);
                o[cur] = o[i];
            }
        }
        return swap;
    }
}