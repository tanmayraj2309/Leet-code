class Solution {
    public int[] checkCyclic(int start, int end, int nums[])
    {
        int arr[]= new int[3];      // [min, max, isCyclic(1)]
        arr[0]= nums[start];
        arr[1]= nums[start];

        int n= end-start+1;
        int falseCount=0;

        // count the number of positions where non-decreasing order is not maintained
        for(int i= start; i<=end; i++)
        {
            if((i<end && nums[i]>nums[i+1]) || (i==end && nums[end] > nums[start]))
                falseCount++;

            arr[0]= Math.min(arr[0], nums[i]);
            arr[1]= Math.max(arr[1], nums[i]);
        }

        // store if sub array is cyclic or not
        if(falseCount>=2)
            arr[2]= 0;              // not cyclic
        else 
            arr[2]= 1;              // cyclic
        
        return arr;
    }

    public int sortableIntegers(int[] nums) {
        int n= nums.length;

        // store all divisors of n
        List<Integer> div= new ArrayList<>();
        for(int i=1; i<=n; i++)
        {
            if(n%i==0)
                div.add(i);
        }

        // loop over array and check each subarray of length = divisor
        int sum= 0;

        for(int k: div)
        {
            boolean isValid= true;
            int prevMax= -1;

            // check if each subarray can be cyclically rotated and all sub arrays become sorted
            for(int i=0; i<n; i+= k)
            {
                int arr[]= checkCyclic(i, i+k-1, nums);       // arr -> [min, max, isCyclic(1)]

                if(arr[2]==0 || arr[0] < prevMax)
                {
                    isValid= false;
                    break;
                }
                prevMax= arr[1];
            }
            if(isValid)
                sum+= k;
        }
        return sum;
    }
}