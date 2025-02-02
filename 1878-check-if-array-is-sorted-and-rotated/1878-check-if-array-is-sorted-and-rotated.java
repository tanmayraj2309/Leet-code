class Solution {
    public boolean check(int[] nums) {
        int n= nums.length;
        int rotationpoint=0;

         if(nums[0]<nums[n-1]){
            rotationpoint++;         
        }   
        for(int i=0;i<n-1;i++){
        if(nums[i]>nums[i+1])
        {
            rotationpoint++;

        }
        if(rotationpoint>1){
            return false;
        }
        }
       
      return true;
        
        
    }
}