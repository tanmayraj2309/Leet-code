class Solution {
    public int minSubarray(int[] nums, int p) {
           long sum =0;
        for(int num:nums){
            sum+=num;
        }
        long rem =sum%p;
        System.out.println(rem);
        if(rem==0){
            return 0;
        }
        return fss(nums,p,rem);

        
    }
    private int fss(int[] nums, int p,long rem){
        HashMap<Long,Integer> pmm = new HashMap<>();
        pmm.put(0L,-1);
        long cs =0;
        int ml = nums.length;
        for(int i=0;i<nums.length;i++){
            cs+=nums[i];
            long cm = cs%p;
            long tm = (cm-rem+p)%p;
            if(pmm.containsKey(tm)){
                ml=Math.min(ml,i-pmm.get(tm));
            }
            pmm.put(cm,i);
        }
        return ml==nums.length?-1:ml;
        
    }
}