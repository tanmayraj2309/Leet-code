class Solution {
    public int maxProduct(int[] nums) {
        int m=nums.length;
        // if(nums.length==0){
        //     return 0;
        // }
        int prefix=1;
        int suffix=1;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<m;i++){
            if(prefix==0){
                prefix=1;
            }
            if(suffix==0){
                suffix=1;
            }
            prefix=prefix*nums[i];
            suffix=suffix*nums[m-i-1];
            ans=Math.max(ans,Math.max(prefix,suffix));
        }
        return ans;
    }
}