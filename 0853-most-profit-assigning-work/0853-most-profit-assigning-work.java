class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        
        int n=difficulty.length;
        int m=worker.length;
        
        int maxprofit=0;


        for(int i=0;i<m;i++){
            int max=0;
            for(int j=0;j<n;j++){
                if(worker[i]>=difficulty[j]){
                    max=  Math.max(max,profit[j]);

                }
            }
            maxprofit =maxprofit+max;
           
        }
        return maxprofit;
       
        
        
    }
}