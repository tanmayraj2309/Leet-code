class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
                // yw wla chiz islitye ho rha kyon ki hum exact goal count of subarray nikalne ke liye= uske less than equal to minus goal ke 1 lest less than ka count nil rhr hai 

          return helper(nums,k)-helper(nums,k-1);
    }
    public int helper(int[] nums, int goal){
        // edge case 
        if(goal<0) return 0;
        int l=0;
        int r=0;
        int sum=0;
        int count=0;
        while(r<nums.length){
            sum+=nums[r]%2;     // to chnaging odd no as 1 and even as 0 and finding sum==k
            while(sum>goal){
                sum= sum-nums[l]%2;
                l=l+1;
            }
            count=count+(r-l+1);
            r=r+1;
        }
        return count;
    }
}