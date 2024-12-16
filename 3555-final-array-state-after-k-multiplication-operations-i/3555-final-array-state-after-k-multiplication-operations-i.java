class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int n = nums.length;
        for(int i=0;i<k;i++){
            int m = 0;
            for(int j=1;j<n;j++){
                if(nums[j]<nums[m]) m = j;
            }
            nums[m] = nums[m] * multiplier;
        }
        return nums;
    }
}