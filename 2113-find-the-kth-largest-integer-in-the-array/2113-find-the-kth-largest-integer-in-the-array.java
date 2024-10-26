import java.math.BigInteger;

class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        
       int n=nums.length;
       BigInteger [] arr = new BigInteger[nums.length];
        for(int i=0;i<n;i++){

            arr[i]=new BigInteger(nums[i]);

        }
        
        Arrays.sort(arr);
        BigInteger ans=arr[n-k];
        return ans.toString();
    }
}