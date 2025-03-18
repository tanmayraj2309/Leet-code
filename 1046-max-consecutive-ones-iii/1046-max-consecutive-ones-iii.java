class Solution {
    public int longestOnes(int[] nums, int k) {
        // Step 1== think this qn as longest subarray with max zeros as k
        // brute force generate all subaarys and check atmost k zero and return max len
        // step2: optimal Tc:2n sc=1
        // step 3: sliding window approach 
        // ekk left and right ponter lege iterate krege right ko jb tk no.of zeros<=k
        // agr exceed krega then phir left ko shrink krege jb tk zero<=k n aho jaye

        int n= nums.length;
        int maxlen=0;
        int left=0;
        int right=0;
        int zeros=0;
        while(right<n){
            if(nums[right]==0) zeros++;
             while(zeros>k){
               if(nums[left]==0){
                 zeros--;
                 }   // shrink from left side 
                 left++;
        }
           
                int len=right-left+1;
                maxlen=Math.max(maxlen,len);
                right++; //expand right side 
        
      
        }
        return maxlen;
    }
}