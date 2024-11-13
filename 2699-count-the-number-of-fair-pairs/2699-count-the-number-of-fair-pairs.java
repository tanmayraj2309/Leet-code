class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        
        Arrays.sort(nums);

        return lowerBound(nums,upper)-lowerBound(nums,lower-1);
    }

    private long lowerBound(int[] nums, int bound){
        long res = 0;

        int i=0,j=nums.length-1;

        while(i<j){
            if(nums[i]+nums[j] <= bound){
                res+=(j-i);
                i++;
            }else{
                j--;
            }
        }

        return res;
    }
}