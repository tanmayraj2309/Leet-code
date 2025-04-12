class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0];
        int maxiprofit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]-buy>maxiprofit)       
            {
               maxiprofit=prices[i]-buy;
            }
            else if(prices[i]<buy){
                buy=prices[i];
            }
        }
        return maxiprofit;
    }
}