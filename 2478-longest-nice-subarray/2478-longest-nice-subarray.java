class Solution {
    public int longestNiceSubarray(int[] nums) {
        int n = nums.length;
        int max = 0;
        int curr_sub = 0;
        int j = 0;
        for(int i = 0; i < n; i++)
        {
            while((curr_sub & nums[i] ) > 0)
            {
                curr_sub ^= nums[j++];
            }
            curr_sub |= nums[i];
            max = Math.max(max , i - j + 1);
        }
        return max;
    }
}