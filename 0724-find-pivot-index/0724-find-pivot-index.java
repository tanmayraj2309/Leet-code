class Solution {
    public int pivotIndex(int[] nums) {

       int n= nums.length;
        int[] pf=new int[n];
        pf[0]=nums[0];
        for(int i=1;i<n;i++){
            pf[i]=pf[i-1]+nums[i];
        }

          if(0==pf[n-1]-pf[0]){
            return 0;
        }
        


        for(int j=1;j<n-1;j++){
            int leftsum=pf[j-1];
            int rightsum=pf[n-1]-pf[j];
            if(leftsum==rightsum){
                return j;
            }
        }
        if(pf[n-2]==0){
            return n-1;
        }
      
        return -1;
    }
}