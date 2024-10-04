class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int res=0;
        for(int i=0;i<nums.length;i++){
            int a=Math.abs(nums[0]-nums[i]);
            res+=a;
            
        }
        return res;
    }
}