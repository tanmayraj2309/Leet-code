class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(i==0 || nums[i]!=nums[i-1]){
                for(int j=i+1;j<nums.length;j++){
                    if(Math.abs(nums[i]-nums[j])==k){
                        count++;
                        break;
                    }
                }
            }
        }
        return count;
    }
}