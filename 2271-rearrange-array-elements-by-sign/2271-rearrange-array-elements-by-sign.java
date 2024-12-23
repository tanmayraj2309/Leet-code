class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        int n= nums.length;
        int res[]=new int[n];
        int posindx=0;
        int negindx=1;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                res[posindx]=nums[i];
                posindx+=2;
            }
            else{
                res[negindx]=nums[i];
                negindx+=2;
            }
        }
        return res;
    }
}