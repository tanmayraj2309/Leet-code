class Solution {
    public int maxProfit(int[] prices) {
        int maxi=0;
        for(int i=1;i<prices.length;i++ ){
            if(prices[i]>prices[i-1]){
                maxi=maxi+prices[i]-prices[i-1];
            }
        }
        return maxi;
    }
}