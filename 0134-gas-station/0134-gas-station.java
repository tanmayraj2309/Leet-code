class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        // int max = Integer.MAX_VALUE;
        // int i = 0;
        // int cost = 0;
        
        // int minI = -1;
        // int minValue = Integer.MAX_VALUE;
        // while(i < gas.length){
        //             if(cost[i]-gas[i]<0) continue;

        //     int diff = gas[i] - cost[i];
        //     minValue = Math.max(minValue,diff);
        //     minI = i;
        //     if(diff == minValue){
        //         minI = Math.min(minI,i);
        //     }
        // }
        // int n = gas.length;
        // for(i = minI;i<n)
        int sum1=0;
        int sum2 =0;
        for(int i=0;i<gas.length;i++){
          sum1+=gas[i];
          sum2+=cost[i];
        }
        if(sum2>sum1) return -1;

        int start=0;
        int tank=0;
        for(int i=0;i<gas.length;i++){
          // if(cost[i]-gas[i]<0) continue;
          sum1+=gas[i];
          sum2+=cost[i];
           
            tank+=gas[i]-cost[i];
            if(tank<0 ){
                start=i+1;
                tank=0;
            }
            
        }
        return  start;
    }
}