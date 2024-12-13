class Solution {
    public int findDuplicate(int[] nums) {
        int n= nums.length;

        // for(int i=0;i<nums.length-1;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(nums[i]==nums[j]){
        //             return nums[i];
        //         }
        //     }
        // }
        // return 0;

        HashMap<Integer,Integer> count= new HashMap<>();
        for(int num:nums){
            if(count.containsKey(num)){
                return num;
            }
            count.put(num,1);
        }
        return -1;    
    }
}