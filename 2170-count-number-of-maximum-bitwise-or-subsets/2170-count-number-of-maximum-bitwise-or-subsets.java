class Solution {
    public int countMaxOrSubsets(int[] nums) {

        /// max bitwise or means= or of all elements
        // find??  subsets = bit or  == maxx

        int maxOr=0;
        for(int i:nums) maxOr|=i;
        return solve(0,nums,0,maxOr);

        
    }
    private int solve(int i,int[] nums,int or, int maxOr){
        
        if(i==nums.length){
        if(or==maxOr) return 1;
        return 0;
        }

        int ans=0;
        // take 
        ans+=solve(i+1,nums, or|nums[i],maxOr);
        // dont Take
        ans+=solve(i+1,nums,or,maxOr);
        return ans;
    }
}