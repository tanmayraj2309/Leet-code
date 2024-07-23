class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        int[] pf= new int[n];
        pf[0]=nums[0];
        int count=0;
         for(int i=1;i<n;i++){
            pf[i]=pf[i-1]+nums[i];
         }


         for(int s=0;s<n;s++){
            int sum=0;
            for(int e=s;e<n;e++){

                if(s==0){
                   if( pf[e]==k){
                    count++;
                   }
                }
                else if(pf[e]-pf[s-1]== k){
                    count++;
                   
                }
            }
         }
         return count;
        
    }
}