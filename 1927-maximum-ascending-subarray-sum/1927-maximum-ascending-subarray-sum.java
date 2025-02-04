class Solution {
    public int maxAscendingSum(int[] nums) {
        int cursum=nums[0];
        int maxi=nums[0];
        int n = nums.length;
        for(int i=1;i<n;i++){
          
            if(nums[i]>nums[i-1]){
                cursum+=nums[i]; 
            }
            else{
               maxi=Math.max(maxi,cursum);
                 cursum=nums[i];
            }
        }
        maxi=Math.max(maxi,cursum);
        return maxi;
        
    }
}