class Solution {
    public boolean isArraySpecial(int[] nums) {
        int n=nums.length;
        if(n<=1){
            return true;
        }
        for(int i=1;i<n;i++){
            if(nums[i]%2==nums[i-1]%2){
                return false;
            }
        }
        return true;
        
    }
}