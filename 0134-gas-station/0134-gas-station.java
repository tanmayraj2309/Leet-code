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
        int tgas=0;
        int tcost =0;
        

        int start=0;
        int tank=0;
        for(int i=0;i<gas.length;i++){
          // if(cost[i]-gas[i]<0) continue;
          tgas+=gas[i];
          tcost+=cost[i];
           
            tank+=gas[i]-cost[i];
            if(tank<0 ){
                start=i+1;
                tank=0;
            }
            
        }
        return  tgas<tcost ? -1 : start;
    }
}