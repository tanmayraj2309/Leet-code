class Solution {
    public int maximumGap(int[] nums) {
        int n=nums.length;
        if(n<2){
            return 0;
        }
        Arrays.sort(nums);
        int dif=0;
        int res=0;
        for(int i=1;i<n;i++){
            dif=nums[i]-nums[i-1];
            res=Math.max(res,dif);
        }
        return res;
        
    }
}