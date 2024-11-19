class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> indx = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            if(indx.containsKey(target-num)){
                return new int[]{i,indx.get(target-num)};
            }
            indx.put(num,i);

        }
         return new int[] {};   
        
    }
}