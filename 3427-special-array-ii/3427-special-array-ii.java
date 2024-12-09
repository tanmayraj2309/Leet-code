class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int n=nums.length;
        int[] count=new int[n];
        count[0]=0;
        // count array to count how muchh parity till here // using prefix method
        for(int i=1;i<n;i++){
           int parity=(nums[i]%2==nums[i-1]%2)?1:0;
           count[i]=count[i-1]+parity;
        }
        boolean[] res=new boolean[queries.length];
        for(int i=0;i<queries.length;i++){
            int start=queries[i][0];
            int end=queries[i][1];
            res[i]= (count[end]-count[start]==0);
        }
        return res;
    }
}