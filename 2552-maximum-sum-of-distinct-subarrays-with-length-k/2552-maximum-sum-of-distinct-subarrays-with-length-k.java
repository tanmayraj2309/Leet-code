class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n=nums.length;
        long maxi=0;
        long currsum=0;
        HashMap<Integer,Integer> mp= new HashMap<>();
        for(int i=0;i<n;i++){
            currsum=currsum+nums[i];
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);

            if(i>=k-1){
            if(mp.size()==k){
                maxi=Math.max(maxi,currsum);
            }
            currsum-=nums[i-k+1];
            mp.put(nums[i-k+1],mp.get(nums[i-k+1])-1);

            if(mp.get(nums[i-k+1])==0){
                mp.remove(nums[i-k+1]);
            }
        }
        }
        return maxi;

    }
}