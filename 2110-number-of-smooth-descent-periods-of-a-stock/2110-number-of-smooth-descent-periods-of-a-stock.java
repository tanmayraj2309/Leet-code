class Solution {
    public long getDescentPeriods(int[] prices) {
        long ans=0;
        long len=1;
        for(int i=1;i<prices.length;i++){
            if(prices[i-1]-prices[i]==1){
                len++;
            }
            else{
                ans+=len*(len+1)/2;
                len=1;
            }
        }
        ans+=len*(len+1)/2;
        return ans;

        
    }
}