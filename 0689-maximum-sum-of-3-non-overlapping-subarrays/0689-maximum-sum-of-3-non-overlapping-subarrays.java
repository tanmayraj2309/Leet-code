class Solution {
    public int[] better(int[] nums, int k)
    {
        int n = nums.length;
        int maxSum = 0;
        int[] ans = new int[3];
        int[] subArray = new int[n];   // it will store the sum of subarray (i,i+k)
        int[] maxRightSum = new int[n]; // max subarray sum on right of each index
        Arrays.fill(maxRightSum,n-1);  // let us assume we found maxsum on n-1 index
        int max = n-1;  // index of max subarray on right
        int windowSum = 0;

        // Calculate the sum of the first window
        for (int i = 0; i < k; i++) 
            windowSum += nums[i];
        
        subArray[0] = windowSum;

        // Use the sliding window technique for the rest of the subarrays
        for (int i = 1; i <= n - k; i++) {
            windowSum = windowSum - nums[i - 1] + nums[i + k - 1]; // Slide the window
            subArray[i] = windowSum;
        }

        for(int i=n-1; i>=k; i--)  
        {
            maxRightSum[i-k+1] = max; 
            if(subArray[i]>=subArray[max])
                max = i;
        } 

        for(int i=0; i<=n-k; i++)
        {
            int s1 = subArray[i];
            for(int j=i+k; j<=n-k; j++)
            {
                int s2 = subArray[j];
                int s3 = subArray[maxRightSum[j]];
                int sum = s1+s2+s3;
                if(maxSum<sum)
                {
                    ans = new int[]{i,j,maxRightSum[j]};
                    maxSum = sum;
                }
            }
        }
        return ans;
    }
    public int[] maxSumOfThreeSubarrays(int[] nums, int k) {
        return better(nums,k);
    }
}