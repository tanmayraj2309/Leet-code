class Solution {
    public boolean canSortArray(int[] nums) {
        int n=nums.length;
        int arr[]=nums.clone();
        Arrays.sort(arr);
     
     // Bubble SOrt
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(nums[j]<=nums[j+1]){
                    continue;
                }
                else if(nums[j]>=nums[j+1] && Integer.bitCount(nums[j])==Integer.bitCount(nums[j+1])){
                    int temp =nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
                else{
                    return false;
                }

            }

        }
        boolean equal= Arrays.equals(nums, arr);
        if(equal==true){
            return true;
        }
       
       return false;

        
        
    }
}