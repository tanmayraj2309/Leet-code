class Solution {
    public long putMarbles(int[] weights, int k) {
        int n = weights.length;
        if(n==k) return 0;
        int[] adjsum = new int[n-1];
        for(int i=0;i<n-1;i++){
            adjsum[i]=weights[i]+weights[i+1];
        }
        Arrays.sort(adjsum);
        long minsum =0, maxsum=0;
        for(int i=0;i<k-1;i++){
            minsum+=adjsum[i];
        }
        for(int i=n-2;i>=n-k;i--){
            maxsum+=adjsum[i];
        }
        return maxsum-minsum;



        
    }
}
