class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int n = nums.length;
        int currMax = 0;
        int currMin = 0;
        int maxi = Integer.MIN_VALUE;
        int mini = Integer.MAX_VALUE;
        
        for (int i = 0; i < n; i++) {
            currMax += nums[i];
            currMin += nums[i];
            
            maxi = Math.max(maxi, currMax);
            mini = Math.min(mini, currMin);
            
            if (currMax < 0) {
                currMax = 0;
            }
            if (currMin > 0) {
                currMin = 0;
            }
        }
        
        return Math.max(Math.abs(maxi), Math.abs(mini));
    }
}