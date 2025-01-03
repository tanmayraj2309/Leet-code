class Solution {
    public int waysToSplitArray(int[] nums) {
        int n=nums.length;
        long[] pf= new long[n];
        pf[0]=nums[0];
        for(int i=1;i<n;i++){
            pf[i]=pf[i-1]+nums[i];
        }
        int count=0;
        for(int i=0;i<n-1;i++){
            
            long leftsum=pf[i];
            long rightsum=pf[n-1]-pf[i];
            if(leftsum>=rightsum){
                count++;
            }
        }
        return count;
        
    }
}